package problema3;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

class masinaMapper implements RowMapper<Masina> {
    public Masina mapRow(ResultSet rs, int rowNum) throws SQLException {
        Masina m = new Masina();
        m.setNr_inmatriculare(rs.getString("nr_inmatriculare"));
        m.setMarca(rs.getString("marca"));
        m.setAn_fab(rs.getInt("an_fabricatie"));
        m.setCuloare(rs.getString("culoare"));
        m.setNr_km(rs.getInt("nr_km"));
        return m;
    }
}
