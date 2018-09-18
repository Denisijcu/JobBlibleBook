package com.poesisbiblicas.coleccion.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class gridview extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);

        GridView gv = (GridView)findViewById(R.id.gridView);


        gv.setAdapter(new ImageAdapter(this));


        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
               // Toast.makeText(gridview.this, "" + position, Toast.LENGTH_LONG).show();

                switch (position){
                    case 0:
                            Toast.makeText(gridview.this, "Job, hombre perfecto y recto, temeroso de Dios y apartado del mal", Toast.LENGTH_SHORT).show();
                            break;
                    case 1:
                        Toast.makeText(gridview.this, "Satanas,,,, pero extiende ahora tu mano y toca todo lo que tiene y veras si no blasfema contra ti en tu misma presencia", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(gridview.this, "Job se levantó y rasgó su manto, y rasuró su cabeza, y se postró en tierra y adoró, y dijo: " +
                                "Desnudo sali del vientre de mi madre, y desnudo volver allá. Jehová dio, y Jehová quitóñ sea el" +
                                " nombre de Jehová bendito", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(gridview.this, "Verso 9. Entonces le dijo su mujer: Aún retienes tu integridad? Maldice a Dios, y muerete." +
                                "Y él le dijo: Como suele hablar cualquiera de las mujeres fatuas, has hablado. Qué? Recibiremos de Dios el bien, y el " +
                                "mal no lo recibiremos", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(gridview.this, "4:1 Entonces respondió Elifaz temanita, y dijo: \n" +
                                "4:2 Si probáremos a hablarte, te será molesto; \n" +
                                "Pero ¿quién podrá detener las palabras? \n" +
                                "4:3 He aquí, tú enseñabas a muchos, \n" +
                                "Y fortalecías las manos débiles; \n" +
                                "4:4 Al que tropezaba enderezaban tus palabras, \n" +
                                "Y esforzabas las rodillas que decaían. \n" +
                                "4:5 Mas ahora que el mal ha venido sobre ti, te desalientas; \n" +
                                "Y cuando ha llegado hasta ti, te turbas. \n" +
                                "4:6 ¿No es tu temor a Dios tu confianza? \n" +
                                "¿No es tu esperanza la integridad de tus caminos? \n" +
                                "4:7 Recapacita ahora; ¿qué inocente se ha perdido? \n" +
                                "Y ¿en dónde han sido destruidos los rectos? ", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(gridview.this, "7:17¿Qué es el hombre, para que lo engrandezcas,\n " +
                        "Y para que pongas sobre él tu corazón, \n" +
                                "7:18 Y lo visites todas las mañanas, \n" +
                                "Y todos los momentos lo pruebes? \n" +
                                "7:19 ¿Hasta cuándo no apartarás de mí tu mirada, \n" +
                                "Y no me soltarás siquiera hasta que trague mi saliva? \n" +
                                "7:20 Si he pecado, ¿qué puedo hacerte a ti, oh Guarda de los hombres? \n" +
                                "¿Por qué me pones por blanco tuyo, \n" +
                                "Hasta convertirme en una carga para mí mismo? \n" +
                                "7:21 ¿Y por qué no quitas mi rebelión, y perdonas mi iniquidad? \n" +
                                "Porque ahora dormiré en el polvo, \n" +
                                "Y si me buscares de mañana, ya no existiré.\n" +
                                "\n", Toast.LENGTH_SHORT).show();
                        break;

                    case 6:
                        Toast.makeText(gridview.this, "Manifestaciones del poder de Dios"  +
                                " 40:6 Respondió Jehová a Job desde el torbellino, y dijo:" +
                                " 40:7 Cíñete ahora como varón tus lomos;" +
                                " Yo te preguntaré, y tú me responderás." +
                                " 40:8 ¿Invalidarás tú también mi juicio?" +
                                "¿Me condenarás a mí, para justificarte tú?" +
                                " 40:9 ¿Tienes tú un brazo como el de Dios?" +
                                " ¿Y truenas con voz como la suya? " +
                                " 40:10 Adórnate ahora de majestad y de alteza," +
                                " Y vístete de honra y de hermosura." +
                                " 40:11 Derrama el ardor de tu ira; " +
                                " Mira a todo altivo, y abátelo. " +
                                " 40:12 Mira a todo soberbio, y humíllalo," +
                                "Y quebranta a los impíos en su sitio. " +
                                "40:13 Encúbrelos a todos en el polvo, " +
                                " Encierra sus rostros en la oscuridad; " +
                                " 40:14 Y yo también te confesaré " +
                                " Que podrá salvarte tu diestra." +
                                "\n", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(gridview.this, "42:10 Y quitó Jehová la aflicción de Job, cuando él hubo orado por sus amigos;"+
                        "y aumentó al doble todas las cosas que habían sido de Job.\n " +
                        "42:11 Y vinieron a él todos sus hermanos y todas sus hermanas, y todos los que antes le habían conocido, y comieron con él pan en su casa, y se condolieron de él, y le consolaron de todo aquel mal que Jehová había traído sobre él; y cada uno de ellos le dio una pieza de dinero y un anillo de oro. \n" +
                                "42:12 Y bendijo Jehová el postrer estado de Job más que el primero; porque tuvo catorce mil ovejas, seis mil camellos, mil yuntas de bueyes y mil asnas, \n" +
                                "42:13 y tuvo siete hijos y tres hijas. \n" +
                                "42:14 Llamó el nombre de la primera, Jemima, el de la segunda, Cesia, y el de la tercera, Keren-hapuc. \n" +
                                "42:15 Y no había mujeres tan hermosas como las hijas de Job en toda la tierra; y les dio su padre herencia entre sus hermanos. \n" +
                                "42:16 Después de esto vivió Job ciento cuarenta años, y vio a sus hijos, y a los hijos de sus hijos, hasta la cuarta generación. \n" +
                                "42:17 Y murió Job viejo y lleno de días." +
                                "\n", Toast.LENGTH_SHORT).show();
                        break;




                }
            }
        });
    }

}
