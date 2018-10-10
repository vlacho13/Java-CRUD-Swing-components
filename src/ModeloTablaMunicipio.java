
import edu.uniciencia.directorio.datos.Municipio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaMunicipio extends AbstractTableModel {

    private List<Municipio> lista = new ArrayList<>();
    private String[] columnas = new String[]{"Nombre", "Codigo Postal"};

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Municipio p = lista.get(rowIndex);
        if (columnIndex == 0) {
            return p.getNombre();
        }
        if (columnIndex == 1) {
            return p.getCodigoPostal();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    public List<Municipio> getLista() {
        return lista;
    }

    public void setLista(List<Municipio> lista) {
        this.lista = lista;
    }

}
