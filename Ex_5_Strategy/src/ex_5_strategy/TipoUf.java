/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_5_strategy;


import ex_5_strategy.UF.CE;
import ex_5_strategy.UF.RJ;
import ex_5_strategy.UF.SP;

/**
 *
 * @author Anderson
 */
public enum TipoUf {
    SP {
        @Override
        public Uf obterUf() {
            return new SP();
        }
    },
    RJ {
        @Override
        public Uf obterUf() {
            return new RJ();
        }
    },
    CE {
        @Override
        public Uf obterUf() {
            return new CE();
        }
    };
    
    public abstract Uf obterUf();
}
