module workshop_javafx_jdbc {
	requires transitive javafx.base;

	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.sql;

	
	exports gui;

	opens gui to javafx.fxml;

	opens application to javafx.graphics, javafx.fxml;

	opens model.entities to javafx.graphics, javafx.fxml, javafx.base;
	
	opens model.services to javafx.graphics, javafx.fxml;

}
