/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbankingpbo;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class userLogin {
    private String[][] data = new String[2][3];
    private String user, password = "";
    
    //ini namanya constructor yang akan dijalankan setiap class diinisialisasikan
    public userLogin(String users, String passwords)
    {
        user = users;
        password = passwords;
        String[][] data = 
        { 
            {"Anhar", "123456"},
            {"Fachrul", "123456"} 
        };
        this.data = data;
    }
    
    private boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(user))
            {
                if(data[i][1].equals(password))
                {
               
                    return true;
                }
            }
        }
        return false;
    }
    
    public void login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            JOptionPane.showMessageDialog(null, "Anda sukses login");
            Home n = new Home();
            n.setVisible(true);
            n.pack();
            n.setLocationRelativeTo(null);
            n.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "PIN yg anda masukan salah!");
        }
    }
}
