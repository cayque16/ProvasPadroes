/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;

/**
 *
 * @author cayqu
 */
public abstract class ObjetoAstronomico {
    private String nome;
    private float latitude,longitude,massa;
    private float velocidade,campoGravi;
    private String tipo;

    public ObjetoAstronomico(String nome, float latitude, float massa, float velocidade, float campoGravi, String tipo) {
        this.nome = nome;
        this.latitude = latitude;
        this.massa = massa;
        this.velocidade = velocidade;
        this.campoGravi = campoGravi;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getMassa() {
        return massa;
    }

    public void setMassa(float massa) {
        this.massa = massa;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public float getCampoGravi() {
        return campoGravi;
    }

    public void setCampoGravi(float campoGravi) {
        this.campoGravi = campoGravi;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public abstract float massaTotal();
}
