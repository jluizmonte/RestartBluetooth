package restartbluetooth;

import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import java.text.ParseException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import restartbluetooth.view.RestartBluetoothView;

/**
 *
 * @author joseluiz
 */
public class RestartBluetooth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SYNTHETICA THEME

        try {
            // Configurar se deve aplicar o look a borda do JFrame  
            //    No caso esta programado para não aplicar (Boolean.FALSE)  
            UIManager.put("Synthetica.window.decoration", Boolean.FALSE);
            //          Configura qual Look você quer usar no projeto  
            UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
            //     Chama a interface do seu programa  
            (new RestartBluetoothView()).setVisible(true);
        } catch (ParseException | UnsupportedLookAndFeelException erro) {
            erro.printStackTrace();
        }
    }

}
