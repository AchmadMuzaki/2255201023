/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasOverride;

/**
 *
 * @author asus
 */
class Kucing extends Hewan {
    @Override
    void makan() {
        System.out.println("Kucing sedang makan ikan.");
    }

    void cakar() {
        System.out.println("Kucing sedang mencakar.");
    }
}
