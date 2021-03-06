package Utils;

import java.util.ArrayList;
import java.util.List;

public class Artist {

    public String nameart;
    public List<Song> album;
    public List<Song> soloist;
    public List<Song> collaborations;

    public Artist(String nameart) {
        this.nameart = nameart;
        this.album = new ArrayList<Song>();
        this.soloist = new ArrayList<Song>();
        this.collaborations = new ArrayList<Song>();
    }

    public void album(Song song){
        this.album.add(song);
    }

    public void MostrarAlbum(Song song){
        System.out.println("\n\n\t---Album: "+song.albumbelong+" de "+this.nameart+"---");
        for (Song s: album) {
            System.out.println("- "+s.namesong+" , Cantante: "+s.artistsong+" , Album: "+s.albumbelong );
        }
    }

    public void soloist(Song song){
        this.soloist.add(song);
    }

    public void Mostrarsoloist(){
        System.out.println("\n\n\t---Lista de reproduccion de "+this.nameart+"(Solista)---");
        for (Song s: soloist) {
            System.out.println("- "+s.namesong+" , Cantante: "+s.artistsong+" , Album: "+s.albumbelong );
        }
    }

    public void collaborations(Song song){
        this.collaborations.add(song);
    }
    public void Mostrar_collaborations(){
        System.out.println("\n\n\t---Lista de reproduccion de "+this.nameart+"(Colaboraciones)---");
        for (Song s: collaborations) {
            System.out.println("- "+s.namesong+" , Cantante: "+s.artistsong+" , Album: "+s.albumbelong );
        }
    }
}
