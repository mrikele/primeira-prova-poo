package Questao6;

import java.util.ArrayList;

public class Cliente{
    private String nome;
    private ArrayList <ContaCorrente> conta;

    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<ContaCorrente> getContas() {
        return conta;
    }

    public ContaCorrente getConta(int index){
        return conta.get(index);
    }

    public ContaCorrente getConta(){
        return conta.get(0);
    }

    public void setConta(ArrayList<ContaCorrente> conta) {
        this.conta = conta;
    }

    public void adicionarConta(ContaCorrente conta) {
        this.conta.add(conta);
    }

    public void removerConta(ContaCorrente conta) {
        this.conta.remove(conta);
    }
    
    @Override
    public String toString() {
        String s = "Cliente\n -Nome: "+nome+"\n";
        for (ContaCorrente c : conta) {
            s = s+c.toString();
        }
        return s;
    }
}