/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import javax.swing.JComboBox;

/**
 *
 * @author khadamikhwan
 */
public class Helper {

    public int updateComboBoxSelection(JComboBox<String> comboBox, String selectedItem) {
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            String item = comboBox.getItemAt(i);
            String itemVal;
            if (item.contains(":")) {
                itemVal = item.split(":")[1].trim();
            } else {
                itemVal = item;
            }

            if (itemVal.equals(selectedItem)) {
                System.out.println(itemVal.equals(selectedItem) + "===>" + i);
                comboBox.setSelectedIndex(i);
                return i;
            }
        }
        return -1;
    }
}
