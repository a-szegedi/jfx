module de.gfn.gui.firstapp1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.gfn.gui.firstapp1 to javafx.fxml;
    exports de.gfn.gui.firstapp1;
}