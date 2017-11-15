using System;
using System.Data;

using Serpis.Ad;

namespace CArticulo
{
    public partial class ArticuloWindow : Gtk.Window
    {
        public ArticuloWindow(Articulo articulo) : base(Gtk.WindowType.Toplevel) {
            this.Build();
            entryNombre.Text = articulo.Nombre;
            spinbuttonPrecio.Value = Convert.ToDouble(articulo.Precio);
            entryCategoria.Text = articulo.Categoria.ToString();

			saveAction.Activated += delegate {
                articulo.Nombre = entryNombre.Text;
                articulo.Precio = Convert.ToDecimal(spinbuttonPrecio.Value);
                articulo.Categoria = long.Parse(entryCategoria.Text);
                ArticuloDao.Save(articulo);
				Destroy();
			};

        }

	
    }
}
