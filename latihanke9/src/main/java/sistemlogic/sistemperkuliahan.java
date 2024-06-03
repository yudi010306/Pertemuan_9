/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemlogic;

/**
 *
 * @author A-4
 */
public class sistemperkuliahan {
    private perkuliahan[] dataperkuliahans;
    private perkuliahan[] datadosens;
    private perkuliahan[] datamahasiswas;
    private perkuliahan[] datastafs;
    
    public sistemperkuliahan() {
        
    }

    public sistemperkuliahan(perkuliahan[] dataperkuliahans, perkuliahan[] datadosens, perkuliahan[] datamahasiswas, perkuliahan[] datastafs) {
        this.dataperkuliahans = dataperkuliahans;
        this.datadosens = datadosens;
        this.datamahasiswas = datamahasiswas;
        this.datastafs = datastafs;
    }
    
    
}
