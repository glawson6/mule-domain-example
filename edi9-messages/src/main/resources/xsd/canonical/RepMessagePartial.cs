using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Edi9.Service
{

    public partial class RepMsg
    {

        private bool sendPerMessage;


       public bool SendPerMessage
       {
           get
           {
               return sendPerMessage;
           }
           set
           {
               sendPerMessage = value;
           }
       }

    }
}
