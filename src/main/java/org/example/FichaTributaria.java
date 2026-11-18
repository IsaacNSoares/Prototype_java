package org.example;

public class FichaTributaria implements Cloneable {
    private String ncm;
    private Integer cfop;

    public FichaTributaria(String ncm, Integer cfop) {
        super();
        this.ncm = ncm;
        this.cfop = cfop;
    }

    public String getNcm() { return ncm; }
    public void setNcm(String ncm) { this.ncm = ncm; }

    public Integer getCfop() { return cfop; }
    public void setCfop(Integer cfop) { this.cfop = cfop; }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "FichaTributaria{" +
                "ncm='" + ncm + '\'' +
                ", cfop=" + cfop +
                '}';
    }
}