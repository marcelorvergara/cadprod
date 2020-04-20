package cad_prod;
// Generated Apr 20, 2020 7:05:26 PM by Hibernate Tools 4.3.1



/**
 * Produtos generated by hbm2java
 */
public class Produtos  implements java.io.Serializable {


     private int idProd;
     private String codProd;
     private String descProd;
     private Integer qtdProd;
     private Double precoProd;

    public Produtos() {
    }

	
    public Produtos(int idProd) {
        this.idProd = idProd;
    }
    public Produtos(int idProd, String codProd, String descProd, Integer qtdProd, Double precoProd) {
       this.idProd = idProd;
       this.codProd = codProd;
       this.descProd = descProd;
       this.qtdProd = qtdProd;
       this.precoProd = precoProd;
    }
   
    public int getIdProd() {
        return this.idProd;
    }
    
    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }
    public String getCodProd() {
        return this.codProd;
    }
    
    public void setCodProd(String codProd) {
        this.codProd = codProd;
    }
    public String getDescProd() {
        return this.descProd;
    }
    
    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }
    public Integer getQtdProd() {
        return this.qtdProd;
    }
    
    public void setQtdProd(Integer qtdProd) {
        this.qtdProd = qtdProd;
    }
    public Double getPrecoProd() {
        return this.precoProd;
    }
    
    public void setPrecoProd(Double precoProd) {
        this.precoProd = precoProd;
    }




}

