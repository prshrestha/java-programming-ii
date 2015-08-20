/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class MilitaryService implements NationalService {

    private int daysLeft;

    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    @Override
    public int getDaysLeft() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.daysLeft;
    }

    @Override
    public void work() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (this.daysLeft > 0) {
            this.daysLeft--;
        }
    }
}
