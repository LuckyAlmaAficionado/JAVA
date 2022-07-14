/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package InterfaceVol2;

/**
 *
 * @author Lucky
 */
abstract interface IntLampu {
    public static final int KeadaanHidup = 1;
    public static final int KeadaanMati = 0;
    
    public abstract void hidupkan();
    public abstract void matikan();
}
