package problema3;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class masinaMapper {
    public masina mapRow(ResultSet rs, int rowNum) throws SQLException {
        masina m = new masina();
        masina.setNr_inmatriculare(rs.getString("nr_inmatriculare"));
        masina.setMarca(rs.getString("marca"));
        masina.setAn_fab(rs.getInt("an_fab"));
        masina.setCuloare(rs.getString("culoare"));
        masina.setNr_km(rs.getInt("nr_km"));
        return m;
    }
}
