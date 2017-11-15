using System;
namespace CArticulo
{
    public partial class ActionGroup : Gtk.ActionGroup
    {
        public ActionGroup() :
                base("CArticulo.ActionGroup")
        {
            this.Build();
        }
    }
}
