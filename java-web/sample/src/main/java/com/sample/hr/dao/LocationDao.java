package com.sample.hr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sample.hr.vo.Location;
import com.sample.utils.ConnectionUtil;

/**
 * LOCATIONS 테이블에 대한 CRUD기능을 제공하는 클래스
 * @author Dylan
 *
 */
public class LocationDao {

	/**
	 * 모든 부서 소재지 정보를 담음
	 * @return
	 * @throws SQLException
	 */
	public List<Location> getAllLocations() throws SQLException {
		List<Location> locations = new ArrayList<Location>();
		
		String sql = "SELECT * "
				   + "FROM locations "
				   + "ORDER BY city ASC ";
		
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			Location location = new Location();
			location.setId(rs.getInt("location_id"));
			location.setStreetAddress(rs.getString("street_address"));
			location.setPostalCode(rs.getString("postal_code"));
			location.setCity(rs.getString("city"));
			location.setState(rs.getString("state_province"));
			location.setCountryId(rs.getString("country_id"));
			
			locations.add(location);
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		
		return locations;
	}
}
