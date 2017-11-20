using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();

        CellRendererText idCellRendererText = new CellRendererText();
        comboBox.PackStart(idCellRendererText, false);
        comboBox.AddAttribute(idCellRendererText, "text", 0);
        CellRendererText labelCellRenderText = new CellRendererText();
        comboBox.PackStart(labelCellRenderText, false);
        comboBox.AddAttribute(labelCellRenderText, "text", 1);


        ListStore listStore = new ListStore(typeof(string), typeof(string));
        comboBox.Model = listStore;
        TreeIter treeIter = listStore.AppendValues("0", "<sin asignar>");
        listStore.AppendValues("1", "primero");
		listStore.AppendValues("2", "segundo");

        comboBox.SetActiveIter(treeIter);

	}

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }
}
