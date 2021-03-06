package App;

import Utils.Artist;
import Utils.Client;
import Utils.Song;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        //Creamos la lista de canciones en la plataforma
        List<Song> songs_aviables = new ArrayList<Song>();

        //Creamos el cliente
        Client client1 = new Client("Jose Benitez","Jose85B","Jose858@hotmail.com");
        Client client2 = new Client("Ramon Garcia","Ramo_gar","Ramo_gar@gmail.com");
        Client client3 = new Client("Julieth Hernandez","Juli07eth","keyHernan@yahoo.es");

        //Cremos los artistas
        Artist artist1 = new Artist("Juan Gabriel");
        Artist artist2 = new Artist("Alejandro Sanz");
        Artist artist3 = new Artist("Laura Pausini");
        Artist artist4 = new Artist("Marc Anthony");

        //Creamos las canciones
        Song song1 = new Song("Querida","Recuerdos",artist1.nameart);
        Song song2 = new Song("Abrazame Muy fuerte","Abrazame Muy Fuerte",artist1.nameart);
        Song song3 = new Song("El Noa-Noa","Recuerdos",artist1.nameart);
        Song song4 = new Song("MEJOR Homenaje","Recuerdos",artist1.nameart+" feat "+artist3.nameart);
        Song song5 = new Song("Yo Te Recuerdo","Recuerdos",artist1.nameart+" feat "+artist4.nameart);
        Song song6 = new Song("Amiga Mia","Mas",artist2.nameart);
        Song song7 = new Song("Corazon partio","Mas",artist2.nameart);
        Song song8 = new Song("La Fuerza del Corazon","Mas",artist2.nameart+" feat "+artist3.nameart);
        Song song9 = new Song("Mi Soledad y Yo","Mas",artist2.nameart+" feat "+artist3.nameart);
        Song song10 = new Song("En Cambio No","Primavera Anticipada",artist3.nameart);

        //Asignacion de Canciones por artistas
        artist1.album(song1);
        artist1.album(song3);
        artist1.album(song4);
        artist1.album(song5);
        artist2.album(song6);
        artist2.album(song7);
        artist2.album(song8);
        artist2.album(song9);

        //Asignacion a la coleccion de Solista Alejandro Sanz
        artist2.soloist(song6);
        artist2.soloist(song7);

        //Asigancion a la coleccion de Colaboraciones Laura Pausini
        artist3.collaborations(song4);
        artist3.collaborations(song8);
        artist3.collaborations(song9);


        //Asignacion a la lista de canciones en la plataoforma
        songs_aviables.add(song1);
        songs_aviables.add(song2);
        songs_aviables.add(song3);
        songs_aviables.add(song4);
        songs_aviables.add(song5);
        songs_aviables.add(song6);
        songs_aviables.add(song7);
        songs_aviables.add(song8);
        songs_aviables.add(song9);
        songs_aviables.add(song10);

        //Asignacion de canciones a la playlist del cliente1
        client1.Playlistclient(song1);
        client1.Playlistclient(song4);
        client1.Playlistclient(song10);
        client1.Playlistclient(song3);
        client1.Playlistclient(song6);
        client1.Playlistclient(song9);
        client1.Playlistclient(song5);
        client1.Playlistclient(song4);
        //Asignacion de canciones a la playlista del cliente2
        client2.Playlistclient(song1);
        client2.Playlistclient(song2);
        client2.Playlistclient(song3);
        client2.Playlistclient(song4);
        client2.Playlistclient(song5);
        //Asignacion de canciones a la playlista del cliente3
        client3.Playlistclient(song9);
        client3.Playlistclient(song1);
        client3.Playlistclient(song4);
        client3.Playlistclient(song10);



        //Saludo de la plataforma
        System.out.println("\t.....¡Hola esto es JavaMusicPlay!..... \n ......Ofrecemos contenido de MUSICA...... \n");

        //Canciones Mas Escuchadas o Recomendaciones
        System.out.println("\t....CANCIONES RECOMENDADAS....");
        for (Song s: songs_aviables) {
            System.out.println("- "+s.namesong+" , Cantante: "+s.artistsong+" , Album: "+s.albumbelong );
        }

        //Mostrar Album del Artista
        artist1.MostrarAlbum(song1);
        artist2.MostrarAlbum(song6);

        //Mostrar playlist de solista
        artist2.Mostrarsoloist();

        //Mostrar Coleccion de colaboraciones
        artist3.Mostrar_collaborations();

        //Caciones de la PlayList del cliente
        client1.Mostrar_playlistclient();

        //Subscripcion del cliente al album de un artista
        client1.subcr(artist1);
        //Mostrarla
        client1.mostrarSubcripcion();
    }
}
