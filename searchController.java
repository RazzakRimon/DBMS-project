import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class searchController implements Initializable
{
    @FXML
    TextField tcsField;
    @FXML
    TextField tnsField;
    @FXML
    TextField tisField;
    @FXML
    TextField sisField;
    @FXML
    TextField sasField;
    @FXML
    TextField scsField;

    @FXML
    private void tcs(ActionEvent event) throws SQLException
    {

    }
    @FXML
    private void tns(ActionEvent event) throws SQLException
    {

    }
    @FXML
    private void tis(ActionEvent event) throws SQLException
    {
        int id = Integer.parseInt(tisField.getText());

    }
    @FXML
    private void sis(ActionEvent event) throws SQLException
    {

    }
    @FXML
    private void sas(ActionEvent event) throws SQLException
    {

    }
    @FXML
    private void scs(ActionEvent event) throws SQLException
    {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

    }
}
