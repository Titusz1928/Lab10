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
    public void insert(String nume, int varsta) {
        String SQL = "insert into masini (nr_inmatriculare, marca, an_fab,culoare,nr_km) values (?, ?,?,?,?)";
        jdbcTemplateObject.update( SQL, nr_inmatriculare, marca,an_fab,culoare,nr_km);
    }
    public void update(int id, int varsta){
        String SQL = "update persoane set varsta = ? where id = ?";
        jdbcTemplateObject.update(SQL, varsta, id);
    }
    public void delete(int id){
        String SQL = "delete from persoane where id = ?";
        jdbcTemplateObject.update(SQL, id);
    }

    public masina getMasina(String nr_inmatriculare) {
        String SQL = "select * from masini where nr_inmatriculare = ?";
        masina mas = jdbcTemplateObject.queryForObject(SQL,new Object[]{nr_inmatriculare},
                new PersoanaMapper());
        return pers;
    }
    public List<Persoana> getListaPersoane() {
        String SQL = "select * from persoane";
        List <Persoana> pers = jdbcTemplateObject.query(SQL,new PersoanaMapper());
        return pers;
    }
}

