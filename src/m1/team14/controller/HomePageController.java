package m1.team14.controller;
import java.util.List;
import dataproto.Dealer;
import m1.team3.Dealers;
import m1.team3.login.VMSLoginFrame;
// For demo///////////////////
import javax.swing.JOptionPane;
//////////////////////////////
public class HomePageController extends AbstractController {
  public List<Dealer> getDealers() {
    return Dealers.getInstance().getAllDealers();
  }
  public void changeDealer(String val) {
    try {
      this.setModelProperty("DealerId", val);
    } catch(Exception ex) {
      ex.printStackTrace();
    }
  }
  public void gotoLogin() {
    new VMSLoginFrame();
  }
  public void gotoHistory() {
    // For demo///////////////////
    JOptionPane.showMessageDialog(null, "Go to customers' contact history enterance page");
    //////////////////////////////

  }
  public void gotoSearch() {
    // For demo///////////////////
    JOptionPane.showMessageDialog(null, "Go to search page");
    //////////////////////////////
  }
  public void gotoDetail() {
    // For demo///////////////////
    JOptionPane.showMessageDialog(null, "Go to detail page");
    //////////////////////////////
  }
  public void contactMe() {
    // For demo///////////////////
    JOptionPane.showMessageDialog(null, "Contact me");
    //////////////////////////////
  }
}
