package Utils;

import java.util.ArrayList;
import java.util.List;
import Utils.Artist;

public class Client {

    public String nameclient;
    public String nameuser;
    public String emailclient;
    public List<Song> playlistclient;
    public List<Song> subcrialbum;

    public Client(String nameclient, String nameuser, String emailclient) {
        this.nameclient = nameclient;
        this.nameuser = nameuser;
        this.emailclient = emailclient;
        this.playlistclient = new ArrayList<Song>();
        this.subcrialbum = new ArrayList<Song>();
    }

    public void Playlistclient(Song song){
        this.playlistclient.add(song);
    }

    public void Mostrar_playlistclient(){
        System.out.println("\n\n\t---PLAYLIST DE "+this.nameuser+"---");
        for (Song s: playlistclient) {
            System.out.println("- "+s.namesong+" , Cantante: "+s.artistsong+" , Album: "+s.albumbelong );
        }
    }

    public void subcr(Artist artist){
        subcrialbum=artist.album;
    }
    public void mostrarSubcripcion(){
        System.out.println("\n\n\t---SUBSCRIPCION AL ALBUM: "+this.subcrialbum.get(0).albumbelong+"---");
        for (Song s: subcrialbum) {
            System.out.println("- "+s.namesong+" , Cantante: "+s.artistsong+" , Album: "+s.albumbelong );
        }
    }
}
