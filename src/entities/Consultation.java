/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
/**
 *
 * @author HP
 */
public class Consultation {
    private int codec;
    private String constantePrise;
    private String prestation;
    private Medecin med;
    private Ordonance ord;
    
    public Consultation(){
    
    }
    public Consultation(int codec,String constantePrise,String prestation,
            Medecin med,Ordonance ord){
        this.codec = codec;
        this.ord = ord;
        this.constantePrise = constantePrise;
        this.prestation = prestation;
    
    }
     public Consultation(String constantePrise,String prestation,Medecin med,Ordonance ord){
        this.ord = ord;
        this.constantePrise = constantePrise;
        this.prestation = prestation;
    
    }

    public Consultation(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodec() {
        return codec;
    }

    public void setCodec(int codec) {
        this.codec = codec;
    }

    public String getConstantePrise() {
        return constantePrise;
    }

    public void setConstantePrise(String constantePrise) {
        this.constantePrise = constantePrise;
    }

    public String getPrestation() {
        return prestation;
    }

    public void setPrestation(String prestation) {
        this.prestation = prestation;
    }

    public Medecin getMed() {
        return med;
    }

    public void setMed(Medecin med) {
        this.med = med;
    }

    public Ordonance getOrd() {
        return ord;
    }

    public void setOrd(Ordonance ord) {
        this.ord = ord;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    private String date;

    public Object getPat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
