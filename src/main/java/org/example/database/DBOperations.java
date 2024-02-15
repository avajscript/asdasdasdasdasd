package org.example.database;

import org.example.event.Event;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBOperations {
	private static Connection con = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null;


	public static void createEvent(Event event) {
		try {
			con = DBConnection.getConnection();
			String query = "INSERT INTO events (event_name, event_description, event_activities, admission_fees) VALUES (?, ?, ?, ?)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, event.getEventName());
			pstmt.setString(2, event.getEventDescription());
			pstmt.setString(3, event.getEventActivities());
			pstmt.setDouble(4, event.getAdmissionFees());
			pstmt.executeUpdate();


		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
	}

	public static void retrieveEvent(int event_id) {
		try {

		} catch (SQLException sqlException) {

		}
	}

	public static void updateEvent(Event event) {

	}

	public static void deleteEvent(int event_id) {

	}
}
