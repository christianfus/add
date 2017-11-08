using System;
using Gtk;
using System.Data;
using Serpis.Ad;
using MySql.Data.MySqlClient;
using CCategoria;

namespace CCategoria.Properties
{
    public class TreeViewHelper
    {
        public static void Fill(TreeView treeView, string selectSql) {
            IDbCommand dbCommand = App.Instance.Connection.CreateCommand();
            dbCommand.CommandText = selectSql;
            IDataReader dataReader = dbCommand.ExecuteReader();
            int fieldCount = dataReader.FieldCount();
            ListStore listStore = (ListStore)treeView.Model;

            if (listStore == null)
            {
                Type[] types = new Type[fieldCount];

                for (int index = 0; index < fieldCount; index++)
                {
                    treeView.AppendColumn(dataReader.GetName(index), new CellRendererText(), "text", index);
                    types[index] = typeof(string);
                }

                listStore = new ListStore(types);
            }
            while(dataReader.Read()){
                string[] values = new string[fieldCount];
                for (int index = 0; index < fieldCount; index++)
                    values[index] = dataReader[index].ToString();
                listStore.AppendValues(values);
            }
            dataReader.Close();
        }
    }
}
