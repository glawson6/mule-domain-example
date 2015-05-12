package com.cox.automotive.edi9.processor;

import org.mule.DefaultMuleMessage;
import org.mule.api.*;
import org.mule.api.client.MuleClient;
import org.mule.api.context.MuleContextAware;
import org.mule.api.lifecycle.Callable;
import org.mule.api.processor.MessageProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by tap on 5/7/15.
 */
public class DynamicJMSOutboundProcessor implements MessageProcessor, MuleContextAware, Callable {

    private final Logger logger = LoggerFactory.getLogger(DynamicJMSOutboundProcessor.class);
    protected MuleContext context;


    @Override
    public MuleEvent process(MuleEvent event) throws MuleException {

        MuleMessage message = event.getMessage();
        List messageList = (List) message.getPayload();
        logger.info("message.getPayload() => {}", messageList);
        return event;
    }
    @Override
    public Object onCall(MuleEventContext eventContext) throws Exception {
        logger.info("Entering onCall .....");
        MuleMessage message = eventContext.getMessage();
        List messageList = (List) message.getPayload();
        logger.info("message.getPayload() => {}", messageList);
        MuleClient client = context.getClient();
        StringBuilder aggregated = new StringBuilder("AGGREGATED [");
        for (int i = 0; i < messageList.size(); i++ ){
            String messageType = (String) messageList.get(i);
            MuleMessage muleMessage = new DefaultMuleMessage(messageType, context);
            StringBuilder muleURL = new StringBuilder();
            muleMessage.setOutboundProperty("X",messageType);
            client.dispatch("jms://queue1", muleMessage);

            MuleMessage muleMessage2 = new DefaultMuleMessage(messageType, context);
            muleMessage2.setOutboundProperty("X",messageType);
            MuleMessage result = client.send("jms://queue2", muleMessage2);
            aggregated.append(result.getPayload()).append(",");
        }
        aggregated.append("]");
        logger.info("Aggregated response {}",aggregated);
        return eventContext;
    }

    @Override
    public void setMuleContext(MuleContext pContext) {
        this.context = pContext;
    }

}
