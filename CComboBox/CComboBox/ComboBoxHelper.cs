using System;
using Gtk;
using System.Data;
using MySql.Data;
using Serpis.Ad;

namespace Serpis.Ad
{
    public class ComboBoxHelper
    {
        public const string ComboNullLabel = "<sin asignar>";
        public static void Fill(ComboBox comboBox, string selectSql, object id){
            CellRendererText CellRendererText = new CellRendererText();
            comboBox.PackStart(CellRendererText, false);
            comboBox.AddAttribute(CellRendererText, "text", 1);

            IDbCommand dbCommand = App.Instance.Connection.CreateCommand();
            dbCommand.CommandText = selectSql;
            IDataReader dataReader = dbCommand.ExecuteReader();

            ListStore listStore = new ListStore(typeof(string), typeof(string));
            TreeIter initialTreeIter = listStore.AppendValues("0", ComboNullLabel);
            while(dataReader.Read()) {
                TreeIter treeIter = listStore.AppendValues(dataReader[0].ToString(), dataReader[1].ToString());
                if (id.Equals(dataReader[0]))
                    initialTreeIter = treeIter;
            }
            comboBox.SetActiveIter(initialTreeIter);
        }

        private static void init(ComboBox comboBox){
            CellRendererText cellRendererText = new CellRendererText();
            comboBox.PackStart(cellRendererText, false);
            comboBox
        }
    }
}
