/**
 * 
 */
/**
 * 
 */
module GUIProject {
	requires javafx.controls;
    requires javafx.fxml;
    
    opens hust.soict.dsai.javafx to javafx.fxml;
    requires java.desktop;
    exports hust.soict.dsai.javafx;
}