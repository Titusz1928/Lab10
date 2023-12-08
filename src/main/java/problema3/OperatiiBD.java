package problema3;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
class OperatiiBD {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public void insert(String nr_inmatriculare, String marca, int an_fab, String culoare, int nr_km) {
        String SQL = "insert into masini (nr_inmatriculare, marca, an_fabricatie,culoare,nr_km) values (?, ?,?,?,?)";
        jdbcTemplateObject.update( SQL, nr_inmatriculare, marca,an_fab,culoare,nr_km);
    }
    public void delete(String nr_inmatriculare){
        String SQL = "delete from masini where nr_inmatriculare = ?";
        jdbcTemplateObject.update(SQL, nr_inmatriculare);
    }

    public int getNrMarca(String marca) {
        String SQL = "SELECT COUNT(*) FROM masini WHERE marca = ?";

        // Specify the parameters for the SQL query
        Object[] params = { marca };

        // Execute the query and get the count
        int rowCount = jdbcTemplateObject.queryForObject(SQL, Integer.class, params);

        return rowCount;
    }

    public int getNrSubValkm(int val){
        String SQL = "SELECT COUNT(*) FROM masini WHERE nr_km<?";

        // Specify the parameters for the SQL query
        Object[] params = { val };

        // Execute the query and get the count
        int rowCount = jdbcTemplateObject.queryForObject(SQL, Integer.class, params);

        return rowCount;
    }




    public List<Masina> getListaMasini() {
        String SQL = "select * from masini";
        List <Masina> pers = jdbcTemplateObject.query(SQL,new masinaMapper());
        return pers;
    }
}

