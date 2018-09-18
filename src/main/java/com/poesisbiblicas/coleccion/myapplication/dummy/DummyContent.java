package com.poesisbiblicas.coleccion.myapplication.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {


    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 42;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Capitulo " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {

        StringBuilder builder = new StringBuilder();
        //builder.append("Capitulo: ").append(position);

        builder.append(Capitulos(position));

        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;
        public String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }

    private static  String Capitulos(int c) {
        String cap="";
        if (c==1) {
            cap = "Las Calamidades de Job.\n\n" +

                    "1  Hubo en tierra de Uz un varón llamado Job; y era este hombre perfecto y recto, temeroso de Dios y apartado del mal.\n" +
                    "\n" +
                    "2 Y le nacieron siete hijos y tres hijas.\n" +
                    "\n" +
                    "3 Su hacienda era siete mil ovejas, tres mil camellos, quinientas yuntas de bueyes, quinientas asnas, y muchísimos criados; y era aquel varón más grande que todos los orientales.\n" +
                    "\n" +
                    "4 E iban sus hijos y hacían banquetes en sus casas, cada uno en su día; y enviaban a llamar a sus tres hermanas para que comiesen y bebiesen con ellos.\n" +
                    "\n" +
                    "5 Y acontecía que habiendo pasado en turno los días del convite, Job enviaba y los santificaba, y se levantaba de mañana y ofrecía holocaustos conforme al número de todos ellos. Porque decía Job: Quizá habrán pecado mis hijos, y habrán blasfemado contra Dios en sus corazones. De esta manera hacía todos los días.\n" +
                    "\n" +
                    "6 Un día vinieron a presentarse delante de Jehová los hijos de Dios, entre los cuales vino también Satanás.\n" +
                    "\n" +
                    "7 Y dijo Jehová a Satanás: ¿De dónde vienes? Respondiendo Satanás a Jehová, dijo: De rodear la tierra y de andar por ella.\n" +
                    "\n" +
                    "8 Y Jehová dijo a Satanás: ¿No has considerado a mi siervo Job, que no hay otro como él en la tierra, varón perfecto y recto, temeroso de Dios y apartado del mal?\n" +
                    "\n" +
                    "9 Respondiendo Satanás a Jehová, dijo: ¿Acaso teme Job a Dios de balde?\n" +
                    "\n" +
                    "10 ¿No le has cercado alrededor a él y a su casa y a todo lo que tiene? Al trabajo de sus manos has dado bendición; por tanto, sus bienes han aumentado sobre la tierra.\n" +
                    "\n" +
                    "11 Pero extiende ahora tu mano y toca todo lo que tiene, y verás si no blasfema contra ti en tu misma presencia.\n" +
                    "\n" +
                    "12 Dijo Jehová a Satanás: He aquí, todo lo que tiene está en tu mano; solamente no pongas tu mano sobre él. Y salió Satanás de delante de Jehová.\n" +
                    "\n" +
                    "13 Y un día aconteció que sus hijos e hijas comían y bebían vino en casa de su hermano el primogénito,\n" +
                    "\n" +
                    "14 y vino un mensajero a Job, y le dijo: Estaban arando los bueyes, y las asnas paciendo cerca de ellos,\n" +
                    "\n" +
                    "15 y acometieron los sabeos y los tomaron, y mataron a los criados a filo de espada; solamente escapé yo para darte la noticia.\n" +
                    "\n" +
                    "16 Aún estaba éste hablando, cuando vino otro que dijo: Fuego de Dios cayó del cielo, que quemó las ovejas y a los pastores, y los consumió; solamente escapé yo para darte la noticia.\n" +
                    "\n" +
                    "17 Todavía estaba éste hablando, y vino otro que dijo: Los caldeos hicieron tres escuadrones, y arremetieron contra los camellos y se los llevaron, y mataron a los criados a filo de espada; y solamente escapé yo para darte la noticia.\n" +
                    "\n" +
                    "18 Entre tanto que éste hablaba, vino otro que dijo: Tus hijos y tus hijas estaban comiendo y bebiendo vino en casa de su hermano el primogénito;\n" +
                    "\n" +
                    "19 y un gran viento vino del lado del desierto y azotó las cuatro esquinas de la casa, la cual cayó sobre los jóvenes, y murieron; y solamente escapé yo para darte la noticia.\n" +
                    "\n" +
                    "20 Entonces Job se levantó, y rasgó su manto, y rasuró su cabeza, y se postró en tierra y adoró,\n" +
                    "\n" +
                    "21 y dijo: Desnudo salí del vientre de mi madre, y desnudo volveré allá. Jehová dio, y Jehová quitó; sea el nombre de Jehová bendito.\n" +
                    "\n" +
                    "22 En todo esto no pecó Job, ni atribuyó a Dios despropósito alguno.";
        }
        if (c==2) {
            cap = " 2  Aconteció que otro día vinieron los hijos de Dios para presentarse delante de Jehová, y Satanás vino también entre ellos presentándose delante de Jehová.\n" +
                    "\n" +
                    "2 Y dijo Jehová a Satanás: ¿De dónde vienes? Respondió Satanás a Jehová, y dijo: De rodear la tierra, y de andar por ella.\n" +
                    "\n" +
                    "3 Y Jehová dijo a Satanás: ¿No has considerado a mi siervo Job, que no hay otro como él en la tierra, varón perfecto y recto, temeroso de Dios y apartado del mal, y que todavía retiene su integridad, aun cuando tú me incitaste contra él para que lo arruinara sin causa?\n" +
                    "\n" +
                    "4 Respondiendo Satanás, dijo a Jehová: Piel por piel, todo lo que el hombre tiene dará por su vida.\n" +
                    "\n" +
                    "5 Pero extiende ahora tu mano, y toca su hueso y su carne, y verás si no blasfema contra ti en tu misma presencia.\n" +
                    "\n" +
                    "6 Y Jehová dijo a Satanás: He aquí, él está en tu mano; mas guarda su vida.\n" +
                    "\n" +
                    "7 Entonces salió Satanás de la presencia de Jehová, e hirió a Job con una sarna maligna desde la planta del pie hasta la coronilla de la cabeza.\n" +
                    "\n" +
                    "8 Y tomaba Job un tiesto para rascarse con él, y estaba sentado en medio de ceniza.\n" +
                    "\n" +
                    "9 Entonces le dijo su mujer: ¿Aún retienes tu integridad? Maldice a Dios, y muérete.\n" +
                    "\n" +
                    "10 Y él le dijo: Como suele hablar cualquiera de las mujeres fatuas, has hablado. ¿Qué? ¿Recibiremos de Dios el bien, y el mal no lo recibiremos? En todo esto no pecó Job con sus labios.\n" +
                    "\n" +
                    "11 Y tres amigos de Job, Elifaz temanita, Bildad suhita, y Zofar naamatita, luego que oyeron todo este mal que le había sobrevenido, vinieron cada uno de su lugar; porque habían convenido en venir juntos para condolerse de él y para consolarle.\n" +
                    "\n" +
                    "12 Los cuales, alzando los ojos desde lejos, no lo conocieron, y lloraron a gritos; y cada uno de ellos rasgó su manto, y los tres esparcieron polvo sobre sus cabezas hacia el cielo.\n" +
                    "\n" +
                    "13 Así se sentaron con él en tierra por siete días y siete noches, y ninguno le hablaba palabra, porque veían que su dolor era muy grande.";
        }
        if (c==3) {
            cap = " Job maldice el día en que nació\n\n" +
                    "3  Después de esto abrió Job su boca, y maldijo su día.\n" +
                    "2 Y exclamó Job, y dijo:\n" +
                    "3 Perezca el día en que yo nací,\n" +
                    "Y la noche en que se dijo: Varón es concebido.\n" +
                    "4 Sea aquel día sombrío,\n" +
                    "Y no cuide de él Dios desde arriba,\n" +
                    "Ni claridad sobre él resplandezca.\n" +
                    "5 Aféenlo tinieblas y sombra de muerte;\n" +
                    "Repose sobre él nublado\n" +
                    "Que lo haga horrible como día caliginoso.\n" +
                    "6 Ocupe aquella noche la oscuridad;\n" +
                    "No sea contada entre los días del año,\n" +
                    "Ni venga en el número de los meses.\n" +
                    "7 !!Oh, que fuera aquella noche solitaria,\n" +
                    "Que no viniera canción alguna en ella!\n" +
                    "8 Maldíganla los que maldicen el día,\n" +
                    "Los que se aprestan para despertar a Leviatán.\n" +
                    "9 Oscurézcanse las estrellas de su alba;\n" +
                    "Espere la luz, y no venga,\n" +
                    "Ni vea los párpados de la mañana;\n" +
                    "10 Por cuanto no cerró las puertas del vientre donde yo estaba,\n" +
                    "Ni escondió de mis ojos la miseria.\n" +
                    "11 ¿Por qué no morí yo en la matriz,\n" +
                    "O expiré al salir del vientre?\n" +
                    "12 ¿Por qué me recibieron las rodillas?\n" +
                    "¿Y a qué los pechos para que mamase?\n" +
                    "13 Pues ahora estaría yo muerto, y reposaría;\n" +
                    "Dormiría, y entonces tendría descanso,\n" +
                    "14 Con los reyes y con los consejeros de la tierra,\n" +
                    "Que reedifican para sí ruinas;\n" +
                    "15 O con los príncipes que poseían el oro,\n" +
                    "Que llenaban de plata sus casas.\n" +
                    "16 ¿Por qué no fui escondido como abortivo,\n" +
                    "Como los pequeñitos que nunca vieron la luz?\n" +
                    "17 Allí los impíos dejan de perturbar,\n" +
                    "Y allí descansan los de agotadas fuerzas.\n" +
                    "18 Allí también reposan los cautivos;\n" +
                    "No oyen la voz del capataz.\n" +
                    "19 Allí están el chico y el grande,\n" +
                    "Y el siervo libre de su señor.\n" +
                    "20 ¿Por qué se da luz al trabajado,\n" +
                    "Y vida a los de ánimo amargado,\n" +
                    "21 Que esperan la muerte, y ella no llega,\n" +
                    "Aunque la buscan más que tesoros;\n" +
                    "22 Que se alegran sobremanera,\n" +
                    "Y se gozan cuando hallan el sepulcro?\n" +
                    "23 ¿Por qué se da vida al hombre que no sabe por donde ha de ir,\n" +
                    "Y a quien Dios ha encerrado?\n" +
                    "24 Pues antes que mi pan viene mi suspiro,\n" +
                    "Y mis gemidos corren como aguas.\n" +
                    "25 Porque el temor que me espantaba me ha venido,\n" +
                    "Y me ha acontecido lo que yo temía.\n" +
                    "26 No he tenido paz, no me aseguré, ni estuve reposado;\n" +
                    "No obstante, me vino turbación.";

        }
        if (c==4) {
            cap = " Elifaz reprende a Job\n\n" +
                    "4  Entonces respondió Elifaz temanita, y dijo:\n" +
                    "2 Si probáremos a hablarte, te será molesto;\n" +
                    "Pero ¿quién podrá detener las palabras?\n" +
                    "3 He aquí, tú enseñabas a muchos,\n" +
                    "Y fortalecías las manos débiles;\n" +
                    "4 Al que tropezaba enderezaban tus palabras,\n" +
                    "Y esforzabas las rodillas que decaían.\n" +
                    "5 Mas ahora que el mal ha venido sobre ti, te desalientas;\n" +
                    "Y cuando ha llegado hasta ti, te turbas.\n" +
                    "6 ¿No es tu temor a Dios tu confianza?\n" +
                    "¿No es tu esperanza la integridad de tus caminos?\n" +
                    "7 Recapacita ahora; ¿qué inocente se ha perdido?\n" +
                    "Y ¿en dónde han sido destruidos los rectos?\n" +
                    "8 Como yo he visto, los que aran iniquidad\n" +
                    "Y siembran injuria, la siegan.\n" +
                    "9 Perecen por el aliento de Dios,\n" +
                    "Y por el soplo de su ira son consumidos.\n" +
                    "10 Los rugidos del león, y los bramidos del rugiente,\n" +
                    "Y los dientes de los leoncillos son quebrantados.\n" +
                    "11 El león viejo perece por falta de presa,\n" +
                    "Y los hijos de la leona se dispersan.\n" +
                    "12 El asunto también me era a mí oculto;\n" +
                    "Mas mi oído ha percibido algo de ello.\n" +
                    "13 En imaginaciones de visiones nocturnas,\n" +
                    "Cuando el sueño cae sobre los hombres,\n" +
                    "14 Me sobrevino un espanto y un temblor,\n" +
                    "Que estremeció todos mis huesos;\n" +
                    "15 Y al pasar un espíritu por delante de mí,\n" +
                    "Hizo que se erizara el pelo de mi cuerpo.\n" +
                    "16 Paróse delante de mis ojos un fantasma,\n" +
                    "Cuyo rostro yo no conocí,\n" +
                    "Y quedo, oí que decía:\n" +
                    "17 ¿Será el hombre más justo que Dios?\n" +
                    "¿Será el varón más limpio que el que lo hizo?\n" +
                    "18 He aquí, en sus siervos no confía,\n" +
                    "Y notó necedad en sus ángeles;\n" +
                    "19 !!Cuánto más en los que habitan en casas de barro,\n" +
                    "Cuyos cimientos están en el polvo,\n" +
                    "Y que serán quebrantados por la polilla!\n" +
                    "20 De la mañana a la tarde son destruidos,\n" +
                    "Y se pierden para siempre, sin haber quien repare en ello.\n" +
                    "21 Su hermosura, ¿no se pierde con ellos mismos?\n" +
                    "Y mueren sin haber adquirido sabiduría.";

        }
        if (c==5) {
            cap = "5  Ahora, pues, da voces; ¿habrá quien te responda?\n" +
                    "¿Y a cuál de los santos te volverás?\n" +
                    "2 Es cierto que al necio lo mata la ira,\n" +
                    "Y al codicioso lo consume la envidia.\n" +
                    "3 Yo he visto al necio que echaba raíces,\n" +
                    "Y en la misma hora maldije su habitación.\n" +
                    "4 Sus hijos estarán lejos de la seguridad;\n" +
                    "En la puerta serán quebrantados,\n" +
                    "Y no habrá quien los libre.\n" +
                    "5 Su mies comerán los hambrientos,\n" +
                    "Y la sacarán de entre los espinos,\n" +
                    "Y los sedientos beberán su hacienda.\n" +
                    "6 Porque la aflicción no sale del polvo,\n" +
                    "Ni la molestia brota de la tierra.\n" +
                    "7 Pero como las chispas se levantan para volar por el aire,\n" +
                    "Así el hombre nace para la aflicción.\n" +
                    "8 Ciertamente yo buscaría a Dios,\n" +
                    "Y encomendaría a él mi causa;\n" +
                    "9 El cual hace cosas grandes e inescrutables,\n" +
                    "Y maravillas sin número;\n" +
                    "10 Que da la lluvia sobre la faz de la tierra,\n" +
                    "Y envía las aguas sobre los campos;\n" +
                    "11 Que pone a los humildes en altura,\n" +
                    "Y a los enlutados levanta a seguridad;\n" +
                    "12 Que frustra los pensamientos de los astutos,\n" +
                    "Para que sus manos no hagan nada;\n" +
                    "13 Que prende a los sabios en la astucia de ellos,\n" +
                    "Y frustra los designios de los perversos.\n" +
                    "14 De día tropiezan con tinieblas,\n" +
                    "Y a mediodía andan a tientas como de noche.\n" +
                    "15 Así libra de la espada al pobre, de la boca de los impíos,\n" +
                    "Y de la mano violenta;\n" +
                    "16 Pues es esperanza al menesteroso,\n" +
                    "Y la iniquidad cerrará su boca.\n" +
                    "17 He aquí, bienaventurado es el hombre a quien Dios castiga;\n" +
                    "Por tanto, no menosprecies la corrección del Todopoderoso.\n" +
                    "18 Porque él es quien hace la llaga, y él la vendará;\n" +
                    "El hiere, y sus manos curan.\n" +
                    "19 En seis tribulaciones te librará,\n" +
                    "Y en la séptima no te tocará el mal.\n" +
                    "20 En el hambre te salvará de la muerte,\n" +
                    "Y del poder de la espada en la guerra.\n" +
                    "21 Del azote de la lengua serás encubierto;\n" +
                    "No temerás la destrucción cuando viniere.\n" +
                    "22 De la destrucción y del hambre te reirás,\n" +
                    "Y no temerás de las fieras del campo;\n" +
                    "23 Pues aun con las piedras del campo tendrás tu pacto,\n" +
                    "Y las fieras del campo estarán en paz contigo.\n" +
                    "24 Sabrás que hay paz en tu tienda;\n" +
                    "Visitarás tu morada, y nada te faltará.\n" +
                    "25 Asimismo echarás de ver que tu descendencia es mucha,\n" +
                    "Y tu prole como la hierba de la tierra.\n" +
                    "26 Vendrás en la vejez a la sepultura,\n" +
                    "Como la gavilla de trigo que se recoge a su tiempo.\n" +
                    "27 He aquí lo que hemos inquirido, lo cual es así;\n" +
                    "Oyelo, y conócelo tú para tu provecho.";
        }
        if (c==6) {
            cap = "Job reprocha la actitud de sus amigos\n\n" +
                    "6  Respondió entonces Job, y dijo:\n" +
                    "2 !!Oh, que pesasen justamente mi queja y mi tormento,\n" +
                    "Y se alzasen igualmente en balanza!\n" +
                    "3 Porque pesarían ahora más que la arena del mar;\n" +
                    "Por eso mis palabras han sido precipitadas.\n" +
                    "4 Porque las saetas del Todopoderoso están en mí,\n" +
                    "Cuyo veneno bebe mi espíritu;\n" +
                    "Y terrores de Dios me combaten.\n" +
                    "5 ¿Acaso gime el asno montés junto a la hierba?\n" +
                    "¿Muge el buey junto a su pasto?\n" +
                    "6 ¿Se comerá lo desabrido sin sal?\n" +
                    "¿Habrá gusto en la clara del huevo?\n" +
                    "7 Las cosas que mi alma no quería tocar,\n" +
                    "Son ahora mi alimento.\n" +
                    "8 !!Quién me diera que viniese mi petición,\n" +
                    "Y que me otorgase Dios lo que anhelo,\n" +
                    "9 Y que agradara a Dios quebrantarme;\n" +
                    "Que soltara su mano, y acabara conmigo!\n" +
                    "10 Sería aún mi consuelo,\n" +
                    "Si me asaltase con dolor sin dar más tregua,\n" +
                    "Que yo no he escondido las palabras del Santo.\n" +
                    "11 ¿Cuál es mi fuerza para esperar aún?\n" +
                    "¿Y cuál mi fin para que tenga aún paciencia?\n" +
                    "12 ¿Es mi fuerza la de las piedras,\n" +
                    "O es mi carne de bronce?\n" +
                    "13 ¿No es así que ni aun a mí mismo me puedo valer,\n" +
                    "Y que todo auxilio me ha faltado?\n" +
                    "14 El atribulado es consolado por su compañero;\n" +
                    "Aun aquel que abandona el temor del Omnipotente.\n" +
                    "15 Pero mis hermanos me traicionaron como un torrente;\n" +
                    "Pasan como corrientes impetuosas\n" +
                    "16 Que están escondidas por la helada,\n" +
                    "Y encubiertas por la nieve;\n" +
                    "17 Que al tiempo del calor son deshechas,\n" +
                    "Y al calentarse, desaparecen de su lugar;\n" +
                    "18 Se apartan de la senda de su rumbo,\n" +
                    "Van menguando, y se pierden.\n" +
                    "19 Miraron los caminantes de Temán,\n" +
                    "Los caminantes de Sabá esperaron en ellas;\n" +
                    "20 Pero fueron avergonzados por su esperanza;\n" +
                    "Porque vinieron hasta ellas, y se hallaron confusos.\n" +
                    "21 Ahora ciertamente como ellas sois vosotros;\n" +
                    "Pues habéis visto el tormento, y teméis.\n" +
                    "22 ¿Os he dicho yo: Traedme,\n" +
                    "Y pagad por mí de vuestra hacienda;\n" +
                    "23 Libradme de la mano del opresor,\n" +
                    "Y redimidme del poder de los violentos?\n" +
                    "24 Enseñadme, y yo callaré;\n" +
                    "Hacedme entender en qué he errado.\n" +
                    "25 !!Cuán eficaces son las palabras rectas!\n" +
                    "Pero ¿qué reprende la censura vuestra?\n" +
                    "26 ¿Pensáis censurar palabras,\n" +
                    "Y los discursos de un desesperado, que son como el viento?\n" +
                    "27 También os arrojáis sobre el huérfano,\n" +
                    "Y caváis un hoyo para vuestro amigo.\n" +
                    "28 Ahora, pues, si queréis, miradme,\n" +
                    "Y ved si digo mentira delante de vosotros.\n" +
                    "29 Volved ahora, y no haya iniquidad;\n" +
                    "Volved aún a considerar mi justicia en esto.\n" +
                    "30 ¿Hay iniquidad en mi lengua?\n" +
                    "¿Acaso no puede mi paladar discernir las cosas inicuas?";
        }

        if (c==7) {
            cap = "Job argumenta contra Dios\n\n" +
                    "7  ¿No es acaso brega la vida del hombre sobre la tierra,\n" +
                    "    Y sus días como los días del jornalero?\n" +
                    "2 Como el siervo suspira por la sombra,\n" +
                    "Y como el jornalero espera el reposo de su trabajo,\n" +
                    "3 Así he recibido meses de calamidad,\n" +
                    "Y noches de trabajo me dieron por cuenta.\n" +
                    "4 Cuando estoy acostado, digo: ¿Cuándo me levantaré?\n" +
                    "Mas la noche es larga, y estoy lleno de inquietudes hasta el alba.\n" +
                    "5 Mi carne está vestida de gusanos, y de costras de polvo;\n" +
                    "Mi piel hendida y abominable.\n" +
                    "6 Y mis días fueron más veloces que la lanzadera del tejedor,\n" +
                    "Y fenecieron sin esperanza.\n" +
                    "7 Acuérdate que mi vida es un soplo,\n" +
                    "Y que mis ojos no volverán a ver el bien.\n" +
                    "8 Los ojos de los que me ven, no me verán más;\n" +
                    "Fijarás en mí tus ojos, y dejaré de ser.\n" +
                    "9 Como la nube se desvanece y se va,\n" +
                    "Así el que desciende al Seol no subirá;\n" +
                    "10 No volverá más a su casa,\n" +
                    "Ni su lugar le conocerá más.\n" +
                    "11 Por tanto, no refrenaré mi boca;\n" +
                    "Hablaré en la angustia de mi espíritu,\n" +
                    "Y me quejaré con la amargura de mi alma.\n" +
                    "12 ¿Soy yo el mar, o un monstruo marino,\n" +
                    "Para que me pongas guarda?\n" +
                    "13 Cuando digo: Me consolará mi lecho,\n" +
                    "Mi cama atenuará mis quejas;\n" +
                    "14 Entonces me asustas con sueños,\n" +
                    "Y me aterras con visiones.\n" +
                    "15 Y así mi alma tuvo por mejor la estrangulación,\n" +
                    "Y quiso la muerte más que mis huesos.\n" +
                    "16 Abomino de mi vida; no he de vivir para siempre;\n" +
                    "Déjame, pues, porque mis días son vanidad.\n" +
                    "17 ¿Qué es el hombre, para que lo engrandezcas,\n" +
                    "Y para que pongas sobre él tu corazón,\n" +
                    "18 Y lo visites todas las mañanas,\n" +
                    "Y todos los momentos lo pruebes?\n" +
                    "19 ¿Hasta cuándo no apartarás de mí tu mirada,\n" +
                    "Y no me soltarás siquiera hasta que trague mi saliva?\n" +
                    "20 Si he pecado, ¿qué puedo hacerte a ti, oh Guarda de los hombres?\n" +
                    "¿Por qué me pones por blanco tuyo,\n" +
                    "Hasta convertirme en una carga para mí mismo?\n" +
                    "21 ¿Y por qué no quitas mi rebelión, y perdonas mi iniquidad?\n" +
                    "Porque ahora dormiré en el polvo,\n" +
                    "Y si me buscares de mañana, ya no existiré.";
        }

        if (c==8) {
            cap = "Bildad proclama la justicia de Dios\n\n" +
                    "8  Respondió Bildad suhita, y dijo:\n" +
                    "2 ¿Hasta cuándo hablarás tales cosas,\n" +
                    "Y las palabras de tu boca serán como viento impetuoso?\n" +
                    "3 ¿Acaso torcerá Dios el derecho,\n" +
                    "O pervertirá el Todopoderoso la justicia?\n" +
                    "4 Si tus hijos pecaron contra él,\n" +
                    "El los echó en el lugar de su pecado.\n" +
                    "5 Si tú de mañana buscares a Dios,\n" +
                    "Y rogares al Todopoderoso;\n" +
                    "6 Si fueres limpio y recto,\n" +
                    "Ciertamente luego se despertará por ti,\n" +
                    "Y hará próspera la morada de tu justicia.\n" +
                    "7 Y aunque tu principio haya sido pequeño,\n" +
                    "Tu postrer estado será muy grande.\n" +
                    "8 Porque pregunta ahora a las generaciones pasadas,\n" +
                    "Y disponte para inquirir a los padres de ellas;\n" +
                    "9 Pues nosotros somos de ayer, y nada sabemos,\n" +
                    "Siendo nuestros días sobre la tierra como sombra.\n" +
                    "10 ¿No te enseñarán ellos, te hablarán,\n" +
                    "Y de su corazón sacarán palabras?\n" +
                    "11 ¿Crece el junco sin lodo?\n" +
                    "¿Crece el prado sin agua?\n" +
                    "12 Aun en su verdor, y sin haber sido cortado,\n" +
                    "Con todo, se seca primero que toda hierba.\n" +
                    "13 Tales son los caminos de todos los que olvidan a Dios;\n" +
                    "Y la esperanza del impío perecerá;\n" +
                    "14 Porque su esperanza será cortada,\n" +
                    "Y su confianza es tela de araña.\n" +
                    "15 Se apoyará él en su casa, mas no permanecerá ella en pie;\n" +
                    "Se asirá de ella, mas no resistirá.\n" +
                    "16 A manera de un árbol está verde delante del sol,\n" +
                    "Y sus renuevos salen sobre su huerto;\n" +
                    "17 Se van entretejiendo sus raíces junto a una fuente,\n" +
                    "Y enlazándose hasta un lugar pedregoso.\n" +
                    "18 Si le arrancaren de su lugar,\n" +
                    "Este le negará entonces, diciendo: Nunca te vi.\n" +
                    "19 Ciertamente este será el gozo de su camino;\n" +
                    "Y del polvo mismo nacerán otros.\n" +
                    "20 He aquí, Dios no aborrece al perfecto,\n" +
                    "Ni apoya la mano de los malignos.\n" +
                    "21 Aún llenará tu boca de risa,\n" +
                    "Y tus labios de júbilo.\n" +
                    "22 Los que te aborrecen serán vestidos de confusión;\n" +
                    "Y la habitación de los impíos perecerá.";
        }
        if (c==9) {
            cap = "Incapacidad de Job para responder a Dios\n\n" +
                    "9  Respondió Job, y dijo:\n" +
                    "2 Ciertamente yo sé que es así;\n" +
                    "¿Y cómo se justificará el hombre con Dios?\n" +
                    "3 Si quisiere contender con él,\n" +
                    "No le podrá responder a una cosa entre mil.\n" +
                    "4 El es sabio de corazón, y poderoso en fuerzas;\n" +
                    "¿Quién se endureció contra él, y le fue bien?\n" +
                    "5 El arranca los montes con su furor,\n" +
                    "Y no saben quién los trastornó;\n" +
                    "6 El remueve la tierra de su lugar,\n" +
                    "Y hace temblar sus columnas;\n" +
                    "7 El manda al sol, y no sale;\n" +
                    "Y sella las estrellas;\n" +
                    "8 El solo extendió los cielos,\n" +
                    "Y anda sobre las olas del mar;\n" +
                    "9 El hizo la Osa, el Orión y las Pléyades,\n" +
                    "Y los lugares secretos del sur;\n" +
                    "10 El hace cosas grandes e incomprensibles,\n" +
                    "Y maravillosas, sin número.\n" +
                    "11 He aquí que él pasará delante de mí, y yo no lo veré;\n" +
                    "Pasará, y no lo entenderé.\n" +
                    "12 He aquí, arrebatará; ¿quién le hará restituir?\n" +
                    "¿Quién le dirá: ¿Qué haces?\n" +
                    "13 Dios no volverá atrás su ira,\n" +
                    "Y debajo de él se abaten los que ayudan a los soberbios.\n" +
                    "14 ¿Cuánto menos le responderé yo,\n" +
                    "Y hablaré con él palabras escogidas?\n" +
                    "15 Aunque fuese yo justo, no respondería;\n" +
                    "Antes habría de rogar a mi juez.\n" +
                    "16 Si yo le invocara, y él me respondiese,\n" +
                    "Aún no creeré que haya escuchado mi voz.\n" +
                    "17 Porque me ha quebrantado con tempestad,\n" +
                    "Y ha aumentado mis heridas sin causa.\n" +
                    "18 No me ha concedido que tome aliento,\n" +
                    "Sino que me ha llenado de amarguras.\n" +
                    "19 Si habláremos de su potencia, por cierto es fuerte;\n" +
                    "Si de juicio, ¿quién me emplazará?\n" +
                    "20 Si yo me justificare, me condenaría mi boca;\n" +
                    "Si me dijere perfecto, esto me haría inicuo.\n" +
                    "21 Si fuese íntegro, no haría caso de mí mismo;\n" +
                    "Despreciaría mi vida.\n" +
                    "22 Una cosa resta que yo diga:\n" +
                    "Al perfecto y al impío él los consume.\n" +
                    "23 Si azote mata de repente,\n" +
                    "Se ríe del sufrimiento de los inocentes.\n" +
                    "24 La tierra es entregada en manos de los impíos,\n" +
                    "Y él cubre el rostro de sus jueces.\n" +
                    "Si no es él, ¿quién es? ¿Dónde está?\n" +
                    "25 Mis días han sido más ligeros que un correo;\n" +
                    "Huyeron, y no vieron el bien.\n" +
                    "26 Pasaron cual naves veloces;\n" +
                    "Como el águila que se arroja sobre la presa.\n" +
                    "27 Si yo dijere: Olvidaré mi queja,\n" +
                    "Dejaré mi triste semblante, y me esforzaré,\n" +
                    "28 Me turban todos mis dolores;\n" +
                    "Sé que no me tendrás por inocente.\n" +
                    "29 Yo soy impío;\n" +
                    "¿Para qué trabajaré en vano?\n" +
                    "30 Aunque me lave con aguas de nieve,\n" +
                    "Y limpie mis manos con la limpieza misma,\n" +
                    "31 Aún me hundirás en el hoyo,\n" +
                    "Y mis propios vestidos me abominarán.\n" +
                    "32 Porque no es hombre como yo, para que yo le responda,\n" +
                    "Y vengamos juntamente a juicio.\n" +
                    "33 No hay entre nosotros árbitro\n" +
                    "Que ponga su mano sobre nosotros dos.\n" +
                    "34 Quite de sobre mí su vara,\n" +
                    "Y su terror no me espante.\n" +
                    "35 Entonces hablaré, y no le temeré;\n" +
                    "Porque en este estado no estoy en mí.";
        }
        if (c==10) {
            cap = "Job lamenta su condición\n\n" +
                    "10  Está mi alma hastiada de mi vida;\n" +
                    "    Daré libre curso a mi queja,\n" +
                    "    Hablaré con amargura de mi alma.\n" +
                    "2 Diré a Dios: No me condenes;\n" +
                    "Hazme entender por qué contiendes conmigo.\n" +
                    "3 ¿Te parece bien que oprimas,\n" +
                    "Que deseches la obra de tus manos,\n" +
                    "Y que favorezcas los designios de los impíos?\n" +
                    "4 ¿Tienes tú acaso ojos de carne?\n" +
                    "¿Ves tú como ve el hombre?\n" +
                    "5 ¿Son tus días como los días del hombre,\n" +
                    "O tus años como los tiempos humanos,\n" +
                    "6 Para que inquieras mi iniquidad,\n" +
                    "Y busques mi pecado,\n" +
                    "7 Aunque tú sabes que no soy impío,\n" +
                    "Y que no hay quien de tu mano me libre?\n" +
                    "8 Tus manos me hicieron y me formaron;\n" +
                    "¿Y luego te vuelves y me deshaces?\n" +
                    "9 Acuérdate que como a barro me diste forma;\n" +
                    "¿Y en polvo me has de volver?\n" +
                    "10 ¿No me vaciaste como leche,\n" +
                    "Y como queso me cuajaste?\n" +
                    "11 Me vestiste de piel y carne,\n" +
                    "Y me tejiste con huesos y nervios.\n" +
                    "12 Vida y misericordia me concediste,\n" +
                    "Y tu cuidado guardó mi espíritu.\n" +
                    "13 Estas cosas tienes guardadas en tu corazón;\n" +
                    "Yo sé que están cerca de ti.\n" +
                    "14 Si pequé, tú me has observado,\n" +
                    "Y no me tendrás por limpio de mi iniquidad.\n" +
                    "15 Si fuere malo, !!ay de mí!\n" +
                    "Y si fuere justo, no levantaré mi cabeza,\n" +
                    "Estando hastiado de deshonra, y de verme afligido.\n" +
                    "16 Si mi cabeza se alzare, cual león tú me cazas;\n" +
                    "Y vuelves a hacer en mí maravillas.\n" +
                    "17 Renuevas contra mí tus pruebas,\n" +
                    "Y aumentas conmigo tu furor como tropas de relevo.\n" +
                    "18 ¿Por qué me sacaste de la matriz?\n" +
                    "Hubiera yo expirado, y ningún ojo me habría visto.\n" +
                    "19 Fuera como si nunca hubiera existido,\n" +
                    "Llevado del vientre a la sepultura.\n" +
                    "20 ¿No son pocos mis días?\n" +
                    "Cesa, pues, y déjame, para que me consuele un poco,\n" +
                    "21 Antes que vaya para no volver,\n" +
                    "A la tierra de tinieblas y de sombra de muerte;\n" +
                    "22 Tierra de oscuridad, lóbrega,\n" +
                    "Como sombra de muerte y sin orden,\n" +
                    "Y cuya luz es como densas tinieblas.";
        }
        if (c==11) {
            cap = "Zofar acusa de maldad a Job\n\n" +
                    "11  Respondió Zofar naamatita, y dijo:\n" +
                    "2 ¿Las muchas palabras no han de tener respuesta?\n" +
                    "¿Y el hombre que habla mucho será justificado?\n" +
                    "3 ¿Harán tus falacias callar a los hombres?\n" +
                    "¿Harás escarnio y no habrá quien te averg:uence?\n" +
                    "4 Tú dices: Mi doctrina es pura,\n" +
                    "Y yo soy limpio delante de tus ojos.\n" +
                    "5 Mas !!oh, quién diera que Dios hablara,\n" +
                    "Y abriera sus labios contigo,\n" +
                    "6 Y te declarara los secretos de la sabiduría,\n" +
                    "Que son de doble valor que las riquezas!\n" +
                    "Conocerías entonces que Dios te ha castigado menos de lo que tu iniquidad merece.\n" +
                    "7 ¿Descubrirás tú los secretos de Dios?\n" +
                    "¿Llegarás tú a la perfección del Todopoderoso?\n" +
                    "8 Es más alta que los cielos; ¿qué harás?\n" +
                    "Es más profunda que el Seol; ¿cómo la conocerás?\n" +
                    "9 Su dimensión es más extensa que la tierra,\n" +
                    "Y más ancha que el mar.\n" +
                    "10 Si él pasa, y aprisiona, y llama a juicio,\n" +
                    "¿Quién podrá contrarrestarle?\n" +
                    "11 Porque él conoce a los hombres vanos;\n" +
                    "Ve asimismo la iniquidad, ¿y no hará caso?\n" +
                    "12 El hombre vano se hará entendido,\n" +
                    "Cuando un pollino de asno montés nazca hombre.\n" +
                    "13 Si tú dispusieres tu corazón,\n" +
                    "Y extendieres a él tus manos;\n" +
                    "14 Si alguna iniquidad hubiere en tu mano, y la echares de ti,\n" +
                    "Y no consintieres que more en tu casa la injusticia,\n" +
                    "15 Entonces levantarás tu rostro limpio de mancha,\n" +
                    "Y serás fuerte, y nada temerás;\n" +
                    "16 Y olvidarás tu miseria,\n" +
                    "O te acordarás de ella como de aguas que pasaron.\n" +
                    "17 La vida te será más clara que el mediodía;\n" +
                    "Aunque oscureciere, será como la mañana.\n" +
                    "18 Tendrás confianza, porque hay esperanza;\n" +
                    "Mirarás alrededor, y dormirás seguro.\n" +
                    "19 Te acostarás, y no habrá quien te espante;\n" +
                    "Y muchos suplicarán tu favor.\n" +
                    "20 Pero los ojos de los malos se consumirán,\n" +
                    "Y no tendrán refugio;\n" +
                    "Y su esperanza será dar su último suspiro.";
        }

        if (c==12) {
            cap = "Job proclama el poder y la sabiduría de Dios\n\n" +
                    "12  Respondió entonces Job, diciendo:\n" +
                    "2 Ciertamente vosotros sois el pueblo,\n" +
                    "Y con vosotros morirá la sabiduría.\n" +
                    "3 También tengo yo entendimiento como vosotros;\n" +
                    "No soy yo menos que vosotros;\n" +
                    "¿Y quién habrá que no pueda decir otro tanto?\n" +
                    "4 Yo soy uno de quien su amigo se mofa,\n" +
                    "Que invoca a Dios, y él le responde;\n" +
                    "Con todo, el justo y perfecto es escarnecido.\n" +
                    "5 Aquel cuyos pies van a resbalar\n" +
                    "Es como una lámpara despreciada de aquel que está a sus anchas.\n" +
                    "6 Prosperan las tiendas de los ladrones,\n" +
                    "Y los que provocan a Dios viven seguros,\n" +
                    "En cuyas manos él ha puesto cuanto tienen.\n" +
                    "7 Y en efecto, pregunta ahora a las bestias, y ellas te enseñarán;\n" +
                    "A las aves de los cielos, y ellas te lo mostrarán;\n" +
                    "8 O habla a la tierra, y ella te enseñará;\n" +
                    "Los peces del mar te lo declararán también.\n" +
                    "9 ¿Qué cosa de todas estas no entiende\n" +
                    "Que la mano de Jehová la hizo?\n" +
                    "10 En su mano está el alma de todo viviente,\n" +
                    "Y el hálito de todo el género humano.\n" +
                    "11 Ciertamente el oído distingue las palabras,\n" +
                    "Y el paladar gusta las viandas.\n" +
                    "12 En los ancianos está la ciencia,\n" +
                    "Y en la larga edad la inteligencia.\n" +
                    "13 Con Dios está la sabiduría y el poder;\n" +
                    "Suyo es el consejo y la inteligencia.\n" +
                    "14 Si él derriba, no hay quien edifique;\n" +
                    "Encerrará al hombre, y no habrá quien le abra.\n" +
                    "15 Si él detiene las aguas, todo se seca;\n" +
                    "Si las envía, destruyen la tierra.\n" +
                    "16 Con él está el poder y la sabiduría;\n" +
                    "Suyo es el que yerra, y el que hace errar.\n" +
                    "17 El hace andar despojados de consejo a los consejeros,\n" +
                    "Y entontece a los jueces.\n" +
                    "18 El rompe las cadenas de los tiranos,\n" +
                    "Y les ata una soga a sus lomos.\n" +
                    "19 El lleva despojados a los príncipes,\n" +
                    "Y trastorna a los poderosos.\n" +
                    "20 Priva del habla a los que dicen verdad,\n" +
                    "Y quita a los ancianos el consejo.\n" +
                    "21 El derrama menosprecio sobre los príncipes,\n" +
                    "Y desata el cinto de los fuertes.\n" +
                    "22 El descubre las profundidades de las tinieblas,\n" +
                    "Y saca a luz la sombra de muerte.\n" +
                    "23 El multiplica las naciones, y él las destruye;\n" +
                    "Esparce a las naciones, y las vuelve a reunir.\n" +
                    "24 El quita el entendimiento a los jefes del pueblo de la tierra,\n" +
                    "Y los hace vagar como por un yermo sin camino.\n" +
                    "25 Van a tientas, como en tinieblas y sin luz,\n" +
                    "Y los hace errar como borrachos.";
        }

        if (c==13) {
            cap = "Job defiende su integridad\n\n" +
                    "13  He aquí que todas estas cosas han visto mis ojos,\n" +
                    "    Y oído y entendido mis oídos.\n" +
                    "2 Como vosotros lo sabéis, lo sé yo;\n" +
                    "No soy menos que vosotros.\n" +
                    "3 Mas yo hablaría con el Todopoderoso,\n" +
                    "Y querría razonar con Dios.\n" +
                    "4 Porque ciertamente vosotros sois fraguadores de mentira;\n" +
                    "Sois todos vosotros médicos nulos.\n" +
                    "5 Ojalá callarais por completo,\n" +
                    "Porque esto os fuera sabiduría.\n" +
                    "6 Oíd ahora mi razonamiento,\n" +
                    "Y estad atentos a los argumentos de mis labios.\n" +
                    "7 ¿Hablaréis iniquidad por Dios?\n" +
                    "¿Hablaréis por él engaño?\n" +
                    "8 ¿Haréis acepción de personas a su favor?\n" +
                    "¿Contenderéis vosotros por Dios?\n" +
                    "9 ¿Sería bueno que él os escudriñase?\n" +
                    "¿Os burlaréis de él como quien se burla de algún hombre?\n" +
                    "10 El os reprochará de seguro,\n" +
                    "Si solapadamente hacéis acepción de personas.\n" +
                    "11 De cierto su alteza os habría de espantar,\n" +
                    "Y su pavor habría de caer sobre vosotros.\n" +
                    "12 Vuestras máximas son refranes de ceniza,\n" +
                    "Y vuestros baluartes son baluartes de lodo.\n" +
                    "13 Escuchadme, y hablaré yo,\n" +
                    "Y que me venga después lo que viniere.\n" +
                    "14 ¿Por qué quitaré yo mi carne con mis dientes,\n" +
                    "Y tomaré mi vida en mi mano?\n" +
                    "15 He aquí, aunque él me matare, en él esperaré;\n" +
                    "No obstante, defenderé delante de él mis caminos,\n" +
                    "16 Y él mismo será mi salvación,\n" +
                    "Porque no entrará en su presencia el impío.\n" +
                    "17 Oíd con atención mi razonamiento,\n" +
                    "Y mi declaración entre en vuestros oídos.\n" +
                    "18 He aquí ahora, si yo expusiere mi causa,\n" +
                    "Sé que seré justificado.\n" +
                    "19 ¿Quién es el que contenderá conmigo?\n" +
                    "Porque si ahora yo callara, moriría.\n" +
                    "20 A lo menos dos cosas no hagas conmigo;\n" +
                    "Entonces no me esconderé de tu rostro:\n" +
                    "21 Aparta de mí tu mano,\n" +
                    "Y no me asombre tu terror.\n" +
                    "22 Llama luego, y yo responderé;\n" +
                    "O yo hablaré, y respóndeme tú.\n" +
                    "23 ¿Cuántas iniquidades y pecados tengo yo?\n" +
                    "Hazme entender mi transgresión y mi pecado.\n" +
                    "24 ¿Por qué escondes tu rostro,\n" +
                    "Y me cuentas por tu enemigo?\n" +
                    "25 ¿A la hoja arrebatada has de quebrantar,\n" +
                    "Y a una paja seca has de perseguir?\n" +
                    "26 ¿Por qué escribes contra mí amarguras,\n" +
                    "Y me haces cargo de los pecados de mi juventud?\n" +
                    "27 Pones además mis pies en el cepo, y observas todos mis caminos,\n" +
                    "Trazando un límite para las plantas de mis pies.\n" +
                    "28 Y mi cuerpo se va gastando como de carcoma,\n" +
                    "Como vestido que roe la polilla.";
        }
        if (c==14) {
            cap = "Job discurre sobre la brevedad de la vida\n\n" +
                    "14  El hombre nacido de mujer,\n" +
                    "    Corto de días, y hastiado de sinsabores,\n" +
                    "2 Sale como una flor y es cortado,\n" +
                    "Y huye como la sombra y no permanece.\n" +
                    "3 ¿Sobre éste abres tus ojos,\n" +
                    "Y me traes a juicio contigo?\n" +
                    "4 ¿Quién hará limpio a lo inmundo?\n" +
                    "Nadie.\n" +
                    "5 Ciertamente sus días están determinados,\n" +
                    "Y el número de sus meses está cerca de ti;\n" +
                    "Le pusiste límites, de los cuales no pasará.\n" +
                    "6 Si tú lo abandonares, él dejará de ser;\n" +
                    "Entre tanto deseará, como el jornalero, su día.\n" +
                    "7 Porque si el árbol fuere cortado, aún queda de él esperanza;\n" +
                    "Retoñará aún, y sus renuevos no faltarán.\n" +
                    "8 Si se envejeciere en la tierra su raíz,\n" +
                    "Y su tronco fuere muerto en el polvo,\n" +
                    "9 Al percibir el agua reverdecerá,\n" +
                    "Y hará copa como planta nueva.\n" +
                    "10 Mas el hombre morirá, y será cortado;\n" +
                    "Perecerá el hombre, ¿y dónde estará él?\n" +
                    "11 Como las aguas se van del mar,\n" +
                    "Y el río se agota y se seca,\n" +
                    "12 Así el hombre yace y no vuelve a levantarse;\n" +
                    "Hasta que no haya cielo, no despertarán,\n" +
                    "Ni se levantarán de su sueño.\n" +
                    "13 !!Oh, quién me diera que me escondieses en el Seol,\n" +
                    "Que me encubrieses hasta apaciguarse tu ira,\n" +
                    "Que me pusieses plazo, y de mí te acordaras!\n" +
                    "14 Si el hombre muriere, ¿volverá a vivir?\n" +
                    "Todos los días de mi edad esperaré,\n" +
                    "Hasta que venga mi liberación.\n" +
                    "15 Entonces llamarás, y yo te responderé;\n" +
                    "Tendrás afecto a la hechura de tus manos.\n" +
                    "16 Pero ahora me cuentas los pasos,\n" +
                    "Y no das tregua a mi pecado;\n" +
                    "17 Tienes sellada en saco mi prevaricación,\n" +
                    "Y tienes cosida mi iniquidad.\n" +
                    "18 Ciertamente el monte que cae se deshace,\n" +
                    "Y las peñas son removidas de su lugar;\n" +
                    "19 Las piedras se desgastan con el agua impetuosa, que se lleva el polvo de la tierra;\n" +
                    "De igual manera haces tú perecer la esperanza del hombre.\n" +
                    "20 Para siempre serás más fuerte que él, y él se va;\n" +
                    "Demudarás su rostro, y le despedirás.\n" +
                    "21 Sus hijos tendrán honores, pero él no lo sabrá;\n" +
                    "O serán humillados, y no entenderá de ello.\n" +
                    "22 Mas su carne sobre él se dolerá,\n" +
                    "Y se entristecerá en él su alma.";
        }
        if (c==15) {
            cap = "Elifaz reprende a Job\n\n" +
                    "15  Respondió Elifaz temanita, y dijo:\n" +
                    "2 ¿Proferirá el sabio vana sabiduría,\n" +
                    "Y llenará su vientre de viento solano?\n" +
                    "3 ¿Disputará con palabras inútiles,\n" +
                    "Y con razones sin provecho?\n" +
                    "4 Tú también disipas el temor,\n" +
                    "Y menoscabas la oración delante de Dios.\n" +
                    "5 Porque tu boca declaró tu iniquidad,\n" +
                    "Pues has escogido el hablar de los astutos.\n" +
                    "6 Tu boca te condenará, y no yo;\n" +
                    "Y tus labios testificarán contra ti.\n" +
                    "7 ¿Naciste tú primero que Adán?\n" +
                    "¿O fuiste formado antes que los collados?\n" +
                    "8 ¿Oíste tú el secreto de Dios,\n" +
                    "Y está limitada a ti la sabiduría?\n" +
                    "9 ¿Qué sabes tú que no sepamos?\n" +
                    "¿Qué entiendes tú que no se halle en nosotros?\n" +
                    "10 Cabezas canas y hombres muy ancianos hay entre nosotros,\n" +
                    "Mucho más avanzados en días que tu padre.\n" +
                    "11 ¿En tan poco tienes las consolaciones de Dios,\n" +
                    "Y las palabras que con dulzura se te dicen?\n" +
                    "12 ¿Por qué tu corazón te aleja,\n" +
                    "Y por qué guiñan tus ojos,\n" +
                    "13 Para que contra Dios vuelvas tu espíritu,\n" +
                    "Y saques tales palabras de tu boca?\n" +
                    "14 ¿Qué cosa es el hombre para que sea limpio,\n" +
                    "Y para que se justifique el nacido de mujer?\n" +
                    "15 He aquí, en sus santos no confía,\n" +
                    "Y ni aun los cielos son limpios delante de sus ojos;\n" +
                    "16 ¿Cuánto menos el hombre abominable y vil,\n" +
                    "Que bebe la iniquidad como agua?\n" +
                    "17 Escúchame; yo te mostraré,\n" +
                    "Y te contaré lo que he visto;\n" +
                    "18 Lo que los sabios nos contaron\n" +
                    "De sus padres, y no lo encubrieron;\n" +
                    "19 A quienes únicamente fue dada la tierra,\n" +
                    "Y no pasó extraño por en medio de ellos.\n" +
                    "20 Todos sus días, el impío es atormentado de dolor,\n" +
                    "Y el número de sus años está escondido para el violento.\n" +
                    "21 Estruendos espantosos hay en sus oídos;\n" +
                    "En la prosperidad el asolador vendrá sobre él.\n" +
                    "22 El no cree que volverá de las tinieblas,\n" +
                    "Y descubierto está para la espada.\n" +
                    "23 Vaga alrededor tras el pan, diciendo: ¿En dónde está?\n" +
                    "Sabe que le está preparado día de tinieblas.\n" +
                    "24 Tribulación y angustia le turbarán,\n" +
                    "Y se esforzarán contra él como un rey dispuesto para la batalla,\n" +
                    "25 Por cuanto él extendió su mano contra Dios,\n" +
                    "Y se portó con soberbia contra el Todopoderoso.\n" +
                    "26 Corrió contra él con cuello erguido,\n" +
                    "Con la espesa barrera de sus escudos.\n" +
                    "27 Porque la gordura cubrió su rostro,\n" +
                    "E hizo pliegues sobre sus ijares;\n" +
                    "28 Y habitó las ciudades asoladas,\n" +
                    "Las casas inhabitadas,\n" +
                    "Que estaban en ruinas.\n" +
                    "29 No prosperará, ni durarán sus riquezas,\n" +
                    "Ni extenderá por la tierra su hermosura.\n" +
                    "30 No escapará de las tinieblas;\n" +
                    "La llama secará sus ramas,\n" +
                    "Y con el aliento de su boca perecerá.\n" +
                    "31 No confíe el iluso en la vanidad,\n" +
                    "Porque ella será su recompensa.\n" +
                    "32 El será cortado antes de su tiempo,\n" +
                    "Y sus renuevos no reverdecerán.\n" +
                    "33 Perderá su agraz como la vid,\n" +
                    "Y derramará su flor como el olivo.\n" +
                    "34 Porque la congregación de los impíos será asolada,\n" +
                    "Y fuego consumirá las tiendas de soborno.\n" +
                    "35 Concibieron dolor, dieron a luz iniquidad,\n" +
                    "Y en sus entrañas traman engaño.";
        }
        if (c==16) {
            cap = "Job se queja contra Dios\n\n" +
                    "16  Respondió Job, y dijo:\n" +
                    "2 Muchas veces he oído cosas como estas;\n" +
                    "Consoladores molestos sois todos vosotros.\n" +
                    "3 ¿Tendrán fin las palabras vacías?\n" +
                    "¿O qué te anima a responder?\n" +
                    "4 También yo podría hablar como vosotros,\n" +
                    "Si vuestra alma estuviera en lugar de la mía;\n" +
                    "Yo podría hilvanar contra vosotros palabras,\n" +
                    "Y sobre vosotros mover mi cabeza.\n" +
                    "5 Pero yo os alentaría con mis palabras,\n" +
                    "Y la consolación de mis labios apaciguaría vuestro dolor.\n" +
                    "6 Si hablo, mi dolor no cesa;\n" +
                    "Y si dejo de hablar, no se aparta de mí.\n" +
                    "7 Pero ahora tú me has fatigado;\n" +
                    "Has asolado toda mi compañía.\n" +
                    "8 Tú me has llenado de arrugas; testigo es mi flacura,\n" +
                    "Que se levanta contra mí para testificar en mi rostro.\n" +
                    "9 Su furor me despedazó, y me ha sido contrario;\n" +
                    "Crujió sus dientes contra mí;\n" +
                    "Contra mí aguzó sus ojos mi enemigo.\n" +
                    "10 Abrieron contra mí su boca;\n" +
                    "Hirieron mis mejillas con afrenta;\n" +
                    "Contra mí se juntaron todos.\n" +
                    "11 Me ha entregado Dios al mentiroso,\n" +
                    "Y en las manos de los impíos me hizo caer.\n" +
                    "12 Próspero estaba, y me desmenuzó;\n" +
                    "Me arrebató por la cerviz y me despedazó,\n" +
                    "Y me puso por blanco suyo.\n" +
                    "13 Me rodearon sus flecheros,\n" +
                    "Partió mis riñones, y no perdonó;\n" +
                    "Mi hiel derramó por tierra.\n" +
                    "14 Me quebrantó de quebranto en quebranto;\n" +
                    "Corrió contra mí como un gigante.\n" +
                    "15 Cosí cilicio sobre mi piel,\n" +
                    "Y puse mi cabeza en el polvo.\n" +
                    "16 Mi rostro está inflamado con el lloro,\n" +
                    "Y mis párpados entenebrecidos,\n" +
                    "17 A pesar de no haber iniquidad en mis manos,\n" +
                    "Y de haber sido mi oración pura.\n" +
                    "18 !!Oh tierra! no cubras mi sangre,\n" +
                    "Y no haya lugar para mi clamor.\n" +
                    "19 Mas he aquí que en los cielos está mi testigo,\n" +
                    "Y mi testimonio en las alturas.\n" +
                    "20 Disputadores son mis amigos;\n" +
                    "Mas ante Dios derramaré mis lágrimas.\n" +
                    "21 !!Ojalá pudiese disputar el hombre con Dios,\n" +
                    "Como con su prójimo!\n" +
                    "22 Mas los años contados vendrán,\n" +
                    "Y yo iré por el camino de donde no volveré.";
        }

        if (c==17) {
            cap = "17  Mi aliento se agota, se acortan mis días,\n" +
                    "Y me está preparado el sepulcro.\n" +
                    "2 No hay conmigo sino escarnecedores,\n" +
                    "En cuya amargura se detienen mis ojos.\n" +
                    "3 Dame fianza, oh Dios; sea mi protección cerca de ti.\n" +
                    "Porque ¿quién querría responder por mí?\n" +
                    "4 Porque a éstos has escondido de su corazón la inteligencia;\n" +
                    "Por tanto, no los exaltarás.\n" +
                    "5 Al que denuncia a sus amigos como presa,\n" +
                    "Los ojos de sus hijos desfallecerán.\n" +
                    "6 El me ha puesto por refrán de pueblos,\n" +
                    "Y delante de ellos he sido como tamboril.\n" +
                    "7 Mis ojos se oscurecieron por el dolor,\n" +
                    "Y mis pensamientos todos son como sombra.\n" +
                    "8 Los rectos se maravillarán de esto,\n" +
                    "Y el inocente se levantará contra el impío.\n" +
                    "9 No obstante, proseguirá el justo su camino,\n" +
                    "Y el limpio de manos aumentará la fuerza.\n" +
                    "10 Pero volved todos vosotros, y venid ahora,\n" +
                    "Y no hallaré entre vosotros sabio.\n" +
                    "11 Pasaron mis días, fueron arrancados mis pensamientos,\n" +
                    "Los designios de mi corazón.\n" +
                    "12 Pusieron la noche por día,\n" +
                    "Y la luz se acorta delante de las tinieblas.\n" +
                    "13 Si yo espero, el Seol es mi casa;\n" +
                    "Haré mi cama en las tinieblas.\n" +
                    "14 A la corrupción he dicho: Mi padre eres tú;\n" +
                    "A los gusanos: Mi madre y mi hermana.\n" +
                    "15 ¿Dónde, pues, estará ahora mi esperanza?\n" +
                    "Y mi esperanza, ¿quién la verá?\n" +
                    "16 A la profundidad del Seol descenderán,\n" +
                    "Y juntamente descansarán en el polvo.";
        }

        if (c==18) {
            cap = "Bildad describe la suerte de los malos\n\n" +
                    "18  Respondió Bildad suhita, y dijo:\n" +
                    "2 ¿Cuándo pondréis fin a las palabras?\n" +
                    "Entended, y después hablemos.\n" +
                    "3 ¿Por qué somos tenidos por bestias,\n" +
                    "Y a vuestros ojos somos viles?\n" +
                    "4 Oh tú, que te despedazas en tu furor,\n" +
                    "¿Será abandonada la tierra por tu causa,\n" +
                    "Y serán removidas de su lugar las peñas?\n" +
                    "5 Ciertamente la luz de los impíos será apagada,\n" +
                    "Y no resplandecerá la centella de su fuego.\n" +
                    "6 La luz se oscurecerá en su tienda,\n" +
                    "Y se apagará sobre él su lámpara.\n" +
                    "7 Sus pasos vigorosos serán acortados,\n" +
                    "Y su mismo consejo lo precipitará.\n" +
                    "8 Porque red será echada a sus pies,\n" +
                    "Y sobre mallas andará.\n" +
                    "9 Lazo prenderá su calcañar;\n" +
                    "Se afirmará la trampa contra él.\n" +
                    "10 Su cuerda está escondida en la tierra,\n" +
                    "Y una trampa le aguarda en la senda.\n" +
                    "11 De todas partes lo asombrarán temores,\n" +
                    "Y le harán huir desconcertado.\n" +
                    "12 Serán gastadas de hambre sus fuerzas,\n" +
                    "Y a su lado estará preparado quebrantamiento.\n" +
                    "13 La enfermedad roerá su piel,\n" +
                    "Y a sus miembros devorará el primogénito de la muerte.\n" +
                    "14 Su confianza será arrancada de su tienda,\n" +
                    "Y al rey de los espantos será conducido.\n" +
                    "15 En su tienda morará como si no fuese suya;\n" +
                    "Piedra de azufre será esparcida sobre su morada.\n" +
                    "16 Abajo se secarán sus raíces,\n" +
                    "Y arriba serán cortadas sus ramas.\n" +
                    "17 Su memoria perecerá de la tierra,\n" +
                    "Y no tendrá nombre por las calles.\n" +
                    "18 De la luz será lanzado a las tinieblas,\n" +
                    "Y echado fuera del mundo.\n" +
                    "19 No tendrá hijo ni nieto en su pueblo,\n" +
                    "Ni quien le suceda en sus moradas.\n" +
                    "20 Sobre su día se espantarán los de occidente,\n" +
                    "Y pavor caerá sobre los de oriente.\n" +
                    "21 Ciertamente tales son las moradas del impío,\n" +
                    "Y este será el lugar del que no conoció a Dios. ";
        }
        if (c==19) {
            cap = "Job confía en que Dios lo justificará\n\n" +
                    "19  Respondió entonces Job, y dijo:\n" +
                    "2 ¿Hasta cuándo angustiaréis mi alma,\n" +
                    "Y me moleréis con palabras?\n" +
                    "3 Ya me habéis vituperado diez veces;\n" +
                    "¿No os avergonzáis de injuriarme?\n" +
                    "4 Aun siendo verdad que yo haya errado,\n" +
                    "Sobre mí recaería mi error.\n" +
                    "5 Pero si vosotros os engrandecéis contra mí,\n" +
                    "Y contra mí alegáis mi oprobio,\n" +
                    "6 Sabed ahora que Dios me ha derribado,\n" +
                    "Y me ha envuelto en su red.\n" +
                    "7 He aquí, yo clamaré agravio, y no seré oído;\n" +
                    "Daré voces, y no habrá juicio.\n" +
                    "8 Cercó de vallado mi camino, y no pasaré;\n" +
                    "Y sobre mis veredas puso tinieblas.\n" +
                    "9 Me ha despojado de mi gloria,\n" +
                    "Y quitado la corona de mi cabeza.\n" +
                    "10 Me arruinó por todos lados, y perezco;\n" +
                    "Y ha hecho pasar mi esperanza como árbol arrancado.\n" +
                    "11 Hizo arder contra mí su furor,\n" +
                    "Y me contó para sí entre sus enemigos.\n" +
                    "12 Vinieron sus ejércitos a una, y se atrincheraron en mí,\n" +
                    "Y acamparon en derredor de mi tienda.\n" +
                    "13 Hizo alejar de mí a mis hermanos,\n" +
                    "Y mis conocidos como extraños se apartaron de mí.\n" +
                    "14 Mis parientes se detuvieron,\n" +
                    "Y mis conocidos se olvidaron de mí.\n" +
                    "15 Los moradores de mi casa y mis criadas me tuvieron por extraño;\n" +
                    "Forastero fui yo a sus ojos.\n" +
                    "16 Llamé a mi siervo, y no respondió;\n" +
                    "De mi propia boca le suplicaba.\n" +
                    "17 Mi aliento vino a ser extraño a mi mujer,\n" +
                    "Aunque por los hijos de mis entrañas le rogaba.\n" +
                    "18 Aun los muchachos me menospreciaron;\n" +
                    "Al levantarme, hablaban contra mí.\n" +
                    "19 Todos mis íntimos amigos me aborrecieron,\n" +
                    "Y los que yo amaba se volvieron contra mí.\n" +
                    "20 Mi piel y mi carne se pegaron a mis huesos,\n" +
                    "Y he escapado con sólo la piel de mis dientes.\n" +
                    "21 !!Oh, vosotros mis amigos, tened compasión de mí, tened compasión de mí!\n" +
                    "Porque la mano de Dios me ha tocado.\n" +
                    "22 ¿Por qué me perseguís como Dios,\n" +
                    "Y ni aun de mi carne os saciáis?\n" +
                    "23 !!Quién diese ahora que mis palabras fuesen escritas!\n" +
                    "!!Quién diese que se escribiesen en un libro;\n" +
                    "24 Que con cincel de hierro y con plomo\n" +
                    "Fuesen esculpidas en piedra para siempre!\n" +
                    "25 Yo sé que mi Redentor vive,\n" +
                    "Y al fin se levantará sobre el polvo;\n" +
                    "26 Y después de deshecha esta mi piel,\n" +
                    "En mi carne he de ver a Dios;\n" +
                    "27 Al cual veré por mí mismo,\n" +
                    "Y mis ojos lo verán, y no otro,\n" +
                    "Aunque mi corazón desfallece dentro de mí.\n" +
                    "28 Mas debierais decir: ¿Por qué le perseguimos?\n" +
                    "Ya que la raíz del asunto se halla en mí.\n" +
                    "29 Temed vosotros delante de la espada;\n" +
                    "Porque sobreviene el furor de la espada a causa de las injusticias,\n" +
                    "Para que sepáis que hay un juicio. ";
        }
        if (c==20) {
            cap = "Zofar describe las calamidades de los malos\n\n" +
                    "20  Respondió Zofar naamatita, y dijo:\n" +
                    "2 Por cierto mis pensamientos me hacen responder,\n" +
                    "Y por tanto me apresuro.\n" +
                    "3 La reprensión de mi censura he oído,\n" +
                    "Y me hace responder el espíritu de mi inteligencia.\n" +
                    "4 ¿No sabes esto, que así fue siempre,\n" +
                    "Desde el tiempo que fue puesto el hombre sobre la tierra,\n" +
                    "5 Que la alegría de los malos es breve,\n" +
                    "Y el gozo del impío por un momento?\n" +
                    "6 Aunque subiere su altivez hasta el cielo,\n" +
                    "Y su cabeza tocare en las nubes,\n" +
                    "7 Como su estiércol, perecerá para siempre;\n" +
                    "Los que le hubieren visto dirán: ¿Qué hay de él?\n" +
                    "8 Como sueño volará, y no será hallado,\n" +
                    "Y se disipará como visión nocturna.\n" +
                    "9 El ojo que le veía, nunca más le verá,\n" +
                    "Ni su lugar le conocerá más.\n" +
                    "10 Sus hijos solicitarán el favor de los pobres,\n" +
                    "Y sus manos devolverán lo que él robó.\n" +
                    "11 Sus huesos están llenos de su juventud,\n" +
                    "Mas con él en el polvo yacerán.\n" +
                    "12 Si el mal se endulzó en su boca,\n" +
                    "Si lo ocultaba debajo de su lengua,\n" +
                    "13 Si le parecía bien, y no lo dejaba,\n" +
                    "Sino que lo detenía en su paladar;\n" +
                    "14 Su comida se mudará en sus entrañas;\n" +
                    "Hiel de áspides será dentro de él.\n" +
                    "15 Devoró riquezas, pero las vomitará;\n" +
                    "De su vientre las sacará Dios.\n" +
                    "16 Veneno de áspides chupará;\n" +
                    "Lo matará lengua de víbora.\n" +
                    "17 No verá los arroyos, los ríos,\n" +
                    "Los torrentes de miel y de leche.\n" +
                    "18 Restituirá el trabajo conforme a los bienes que tomó,\n" +
                    "Y no los tragará ni gozará.\n" +
                    "19 Por cuanto quebrantó y desamparó a los pobres,\n" +
                    "Robó casas, y no las edificó;\n" +
                    "20 Por tanto, no tendrá sosiego en su vientre,\n" +
                    "Ni salvará nada de lo que codiciaba.\n" +
                    "21 No quedó nada que no comiese;\n" +
                    "Por tanto, su bienestar no será duradero.\n" +
                    "22 En el colmo de su abundancia padecerá estrechez;\n" +
                    "La mano de todos los malvados vendrá sobre él.\n" +
                    "23 Cuando se pusiere a llenar su vientre,\n" +
                    "Dios enviará sobre él el ardor de su ira,\n" +
                    "Y la hará llover sobre él y sobre su comida.\n" +
                    "24 Huirá de las armas de hierro,\n" +
                    "Y el arco de bronce le atravesará.\n" +
                    "25 La saeta le traspasará y saldrá de su cuerpo,\n" +
                    "Y la punta relumbrante saldrá por su hiel;\n" +
                    "Sobre él vendrán terrores.\n" +
                    "26 Todas las tinieblas están reservadas para sus tesoros;\n" +
                    "Fuego no atizado los consumirá;\n" +
                    "Devorará lo que quede en su tienda.\n" +
                    "27 Los cielos descubrirán su iniquidad,\n" +
                    "Y la tierra se levantará contra él.\n" +
                    "28 Los renuevos de su casa serán transportados;\n" +
                    "Serán esparcidos en el día de su furor.\n" +
                    "29 Esta es la porción que Dios prepara al hombre impío,\n" +
                    "Y la heredad que Dios le señala por su palabra.";
        }
        if (c==21) {
            cap = "Job afirma que los malos prosperan\n\n" +
                    "21  Entonces respondió Job, y dijo:\n" +
                    "2 Oíd atentamente mi palabra,\n" +
                    "Y sea esto el consuelo que me deis.\n" +
                    "3 Toleradme, y yo hablaré;\n" +
                    "Y después que haya hablado, escarneced.\n" +
                    "4 ¿Acaso me quejo yo de algún hombre?\n" +
                    "¿Y por qué no se ha de angustiar mi espíritu?\n" +
                    "5 Miradme, y espantaos,\n" +
                    "Y poned la mano sobre la boca.\n" +
                    "6 Aun yo mismo, cuando me acuerdo, me asombro,\n" +
                    "Y el temblor estremece mi carne.\n" +
                    "7 ¿Por qué viven los impíos,\n" +
                    "Y se envejecen, y aun crecen en riquezas?\n" +
                    "8 Su descendencia se robustece a su vista,\n" +
                    "Y sus renuevos están delante de sus ojos.\n" +
                    "9 Sus casas están a salvo de temor,\n" +
                    "Ni viene azote de Dios sobre ellos.\n" +
                    "10 Sus toros engendran, y no fallan;\n" +
                    "Paren sus vacas, y no malogran su cría.\n" +
                    "11 Salen sus pequeñuelos como manada,\n" +
                    "Y sus hijos andan saltando.\n" +
                    "12 Al son de tamboril y de cítara saltan,\n" +
                    "Y se regocijan al son de la flauta.\n" +
                    "13 Pasan sus días en prosperidad,\n" +
                    "Y en paz descienden al Seol.\n" +
                    "14 Dicen, pues, a Dios: Apártate de nosotros,\n" +
                    "Porque no queremos el conocimiento de tus caminos.\n" +
                    "15 ¿Quién es el Todopoderoso, para que le sirvamos?\n" +
                    "¿Y de qué nos aprovechará que oremos a él?\n" +
                    "16 He aquí que su bien no está en mano de ellos;\n" +
                    "El consejo de los impíos lejos esté de mí.\n" +
                    "17 !!Oh, cuántas veces la lámpara de los impíos es apagada,\n" +
                    "Y viene sobre ellos su quebranto,\n" +
                    "Y Dios en su ira les reparte dolores!\n" +
                    "18 Serán como la paja delante del viento,\n" +
                    "Y como el tamo que arrebata el torbellino.\n" +
                    "19 Dios guardará para los hijos de ellos su violencia;\n" +
                    "Le dará su pago, para que conozca.\n" +
                    "20 Verán sus ojos su quebranto,\n" +
                    "Y beberá de la ira del Todopoderoso.\n" +
                    "21 Porque ¿qué deleite tendrá él de su casa después de sí,\n" +
                    "Siendo cortado el número de sus meses?\n" +
                    "22 ¿Enseñará alguien a Dios sabiduría,\n" +
                    "Juzgando él a los que están elevados?\n" +
                    "23 Este morirá en el vigor de su hermosura, todo quieto y pacífico;\n" +
                    "24 Sus vasijas estarán llenas de leche,\n" +
                    "Y sus huesos serán regados de tuétano.\n" +
                    "25 Y este otro morirá en amargura de ánimo,\n" +
                    "Y sin haber comido jamás con gusto.\n" +
                    "26 Igualmente yacerán ellos en el polvo,\n" +
                    "Y gusanos los cubrirán.\n" +
                    "27 He aquí, yo conozco vuestros pensamientos,\n" +
                    "Y las imaginaciones que contra mí forjáis.\n" +
                    "28 Porque decís: ¿Qué hay de la casa del príncipe,\n" +
                    "Y qué de la tienda de las moradas de los impíos?\n" +
                    "29 ¿No habéis preguntado a los que pasan por los caminos,\n" +
                    "Y no habéis conocido su respuesta,\n" +
                    "30 Que el malo es preservado en el día de la destrucción?\n" +
                    "Guardado será en el día de la ira.\n" +
                    "31 ¿Quién le denunciará en su cara su camino?\n" +
                    "Y de lo que él hizo, ¿quién le dará el pago?\n" +
                    "32 Porque llevado será a los sepulcros,\n" +
                    "Y sobre su túmulo estarán velando.\n" +
                    "33 Los terrones del valle le serán dulces;\n" +
                    "Tras de él será llevado todo hombre,\n" +
                    "Y antes de él han ido innumerables.\n" +
                    "34 ¿Cómo, pues, me consoláis en vano,\n" +
                    "Viniendo a parar vuestras respuestas en falacia?";
        }

        if (c==22) {
            cap = "Elifaz acusa a Job de gran maldad\n\n" +
                    "22  Respondió Elifaz temanita, y dijo:\n" +
                    "2 ¿Traerá el hombre provecho a Dios?\n" +
                    "Al contrario, para sí mismo es provechoso el hombre sabio.\n" +
                    "3 ¿Tiene contentamiento el Omnipotente en que tú seas justificado,\n" +
                    "O provecho de que tú hagas perfectos tus caminos?\n" +
                    "4 ¿Acaso te castiga,\n" +
                    "O viene a juicio contigo, a causa de tu piedad?\n" +
                    "5 Por cierto tu malicia es grande,\n" +
                    "Y tus maldades no tienen fin.\n" +
                    "6 Porque sacaste prenda a tus hermanos sin causa,\n" +
                    "Y despojaste de sus ropas a los desnudos.\n" +
                    "7 No diste de beber agua al cansado,\n" +
                    "Y detuviste el pan al hambriento.\n" +
                    "8 Pero el hombre pudiente tuvo la tierra,\n" +
                    "Y habitó en ella el distinguido.\n" +
                    "9 A las viudas enviaste vacías,\n" +
                    "Y los brazos de los huérfanos fueron quebrados.\n" +
                    "10 Por tanto, hay lazos alrededor de ti,\n" +
                    "Y te turba espanto repentino;\n" +
                    "11 O tinieblas, para que no veas,\n" +
                    "Y abundancia de agua te cubre.\n" +
                    "12 ¿No está Dios en la altura de los cielos?\n" +
                    "Mira lo encumbrado de las estrellas, cuán elevadas están.\n" +
                    "13 ¿Y dirás tú: ¿Qué sabe Dios?\n" +
                    "¿Cómo juzgará a través de la oscuridad?\n" +
                    "14 Las nubes le rodearon, y no ve;\n" +
                    "Y por el circuito del cielo se pasea.\n" +
                    "15 ¿Quieres tú seguir la senda antigua\n" +
                    "Que pisaron los hombres perversos,\n" +
                    "16 Los cuales fueron cortados antes de tiempo,\n" +
                    "Cuyo fundamento fue como un río derramado?\n" +
                    "17 Decían a Dios: Apártate de nosotros.\n" +
                    "¿Y qué les había hecho el Omnipotente?\n" +
                    "18 Les había colmado de bienes sus casas.\n" +
                    "Pero sea el consejo de ellos lejos de mí.\n" +
                    "19 Verán los justos y se gozarán;\n" +
                    "Y el inocente los escarnecerá, diciendo:\n" +
                    "20 Fueron destruidos nuestros adversarios,\n" +
                    "Y el fuego consumió lo que de ellos quedó.\n" +
                    "21 Vuelve ahora en amistad con él, y tendrás paz;\n" +
                    "Y por ello te vendrá bien.\n" +
                    "22 Toma ahora la ley de su boca,\n" +
                    "Y pon sus palabras en tu corazón.\n" +
                    "23 Si te volvieres al Omnipotente, serás edificado;\n" +
                    "Alejarás de tu tienda la aflicción;\n" +
                    "24 Tendrás más oro que tierra,\n" +
                    "Y como piedras de arroyos oro de Ofir;\n" +
                    "25 El Todopoderoso será tu defensa,\n" +
                    "Y tendrás plata en abundancia.\n" +
                    "26 Porque entonces te deleitarás en el Omnipotente,\n" +
                    "Y alzarás a Dios tu rostro.\n" +
                    "27 Orarás a él, y él te oirá;\n" +
                    "Y tú pagarás tus votos.\n" +
                    "28 Determinarás asimismo una cosa, y te será firme,\n" +
                    "Y sobre tus caminos resplandecerá luz.\n" +
                    "29 Cuando fueren abatidos, dirás tú: Enaltecimiento habrá;\n" +
                    "Y Dios salvará al humilde de ojos.\n" +
                    "30 El libertará al inocente,\n" +
                    "Y por la limpieza de tus manos éste será librado.";
        }

        if (c==23) {
            cap = "Job desea abogar su causa delante de Dios\n\n" +
                    "23  Respondió Job, y dijo:\n" +
                    "2 Hoy también hablaré con amargura;\n" +
                    "Porque es más grave mi llaga que mi gemido.\n" +
                    "3 !!Quién me diera el saber dónde hallar a Dios!\n" +
                    "Yo iría hasta su silla.\n" +
                    "4 Expondría mi causa delante de él,\n" +
                    "Y llenaría mi boca de argumentos.\n" +
                    "5 Yo sabría lo que él me respondiese,\n" +
                    "Y entendería lo que me dijera.\n" +
                    "6 ¿Contendería conmigo con grandeza de fuerza?\n" +
                    "No; antes él me atendería.\n" +
                    "7 Allí el justo razonaría con él;\n" +
                    "Y yo escaparía para siempre de mi juez.\n" +
                    "8 He aquí yo iré al oriente, y no lo hallaré;\n" +
                    "Y al occidente, y no lo percibiré;\n" +
                    "9 Si muestra su poder al norte, yo no lo veré;\n" +
                    "Al sur se esconderá, y no lo veré.\n" +
                    "10 Mas él conoce mi camino;\n" +
                    "Me probará, y saldré como oro.\n" +
                    "11 Mis pies han seguido sus pisadas;\n" +
                    "Guardé su camino, y no me aparté.\n" +
                    "12 Del mandamiento de sus labios nunca me separé;\n" +
                    "Guardé las palabras de su boca más que mi comida.\n" +
                    "13 Pero si él determina una cosa, ¿quién lo hará cambiar?\n" +
                    "Su alma deseó, e hizo.\n" +
                    "14 El, pues, acabará lo que ha determinado de mí;\n" +
                    "Y muchas cosas como estas hay en él.\n" +
                    "15 Por lo cual yo me espanto en su presencia;\n" +
                    "Cuando lo considero, tiemblo a causa de él.\n" +
                    "16 Dios ha enervado mi corazón,\n" +
                    "Y me ha turbado el Omnipotente.\n" +
                    "17 ¿Por qué no fui yo cortado delante de las tinieblas,\n" +
                    "Ni fue cubierto con oscuridad mi rostro?";
        }
        if (c==24) {
            cap = "Job se queja de que Dios es indiferente ante la maldad\n\n" +
                    "24  Puesto que no son ocultos los tiempos al Todopoderoso,\n" +
                    "    ¿Por qué los que le conocen no ven sus días?\n" +
                    "2 Traspasan los linderos,\n" +
                    "Roban los ganados, y los apacientan.\n" +
                    "3 Se llevan el asno de los huérfanos,\n" +
                    "Y toman en prenda el buey de la viuda.\n" +
                    "4 Hacen apartar del camino a los menesterosos,\n" +
                    "Y todos los pobres de la tierra se esconden.\n" +
                    "5 He aquí, como asnos monteses en el desierto,\n" +
                    "Salen a su obra madrugando para robar;\n" +
                    "El desierto es mantenimiento de sus hijos.\n" +
                    "6 En el campo siegan su pasto,\n" +
                    "Y los impíos vendimian la viña ajena.\n" +
                    "7 Al desnudo hacen dormir sin ropa,\n" +
                    "Sin tener cobertura contra el frío.\n" +
                    "8 Con las lluvias de los montes se mojan,\n" +
                    "Y abrazan las peñas por falta de abrigo.\n" +
                    "9 Quitan el pecho a los huérfanos,\n" +
                    "Y de sobre el pobre toman la prenda.\n" +
                    "10 Al desnudo hacen andar sin vestido,\n" +
                    "Y a los hambrientos quitan las gavillas.\n" +
                    "11 Dentro de sus paredes exprimen el aceite,\n" +
                    "Pisan los lagares, y mueren de sed.\n" +
                    "12 Desde la ciudad gimen los moribundos,\n" +
                    "Y claman las almas de los heridos de muerte,\n" +
                    "Pero Dios no atiende su oración.\n" +
                    "13 Ellos son los que, rebeldes a la luz,\n" +
                    "Nunca conocieron sus caminos,\n" +
                    "Ni estuvieron en sus veredas.\n" +
                    "14 A la luz se levanta el matador; mata al pobre y al necesitado,\n" +
                    "Y de noche es como ladrón.\n" +
                    "15 El ojo del adúltero está aguardando la noche,\n" +
                    "Diciendo: No me verá nadie;\n" +
                    "Y esconde su rostro.\n" +
                    "16 En las tinieblas minan las casas\n" +
                    "Que de día para sí señalaron;\n" +
                    "No conocen la luz.\n" +
                    "17 Porque la mañana es para todos ellos como sombra de muerte;\n" +
                    "Si son conocidos, terrores de sombra de muerte los toman.\n" +
                    "18 Huyen ligeros como corriente de aguas;\n" +
                    "Su porción es maldita en la tierra;\n" +
                    "No andarán por el camino de las viñas.\n" +
                    "19 La sequía y el calor arrebatan las aguas de la nieve;\n" +
                    "Así también el Seol a los pecadores.\n" +
                    "20 Los olvidará el seno materno; de ellos sentirán los gusanos dulzura;\n" +
                    "Nunca más habrá de ellos memoria,\n" +
                    "Y como un árbol los impíos serán quebrantados.\n" +
                    "21 A la mujer estéril, que no concebía, afligió,\n" +
                    "Y a la viuda nunca hizo bien.\n" +
                    "22 Pero a los fuertes adelantó con su poder;\n" +
                    "Una vez que se levante, ninguno está seguro de la vida.\n" +
                    "23 El les da seguridad y confianza;\n" +
                    "Sus ojos están sobre los caminos de ellos.\n" +
                    "24 Fueron exaltados un poco, mas desaparecen,\n" +
                    "Y son abatidos como todos los demás;\n" +
                    "Serán encerrados, y cortados como cabezas de espigas.\n" +
                    "25 Y si no, ¿quién me desmentirá ahora,\n" +
                    "O reducirá a nada mis palabras?";
        }
        if (c==25) {
            cap = "Bildad niega que el hombre pueda ser justificado delante de Dios\n\n" +
                    "25  Respondió Bildad suhita, y dijo:\n" +
                    "2 El señorío y el temor están con él;\n" +
                    "El hace paz en sus alturas.\n" +
                    "3 ¿Tienen sus ejércitos número?\n" +
                    "¿Sobre quién no está su luz?\n" +
                    "4 ¿Cómo, pues, se justificará el hombre para con Dios?\n" +
                    "¿Y cómo será limpio el que nace de mujer?\n" +
                    "5 He aquí que ni aun la misma luna será resplandeciente,\n" +
                    "Ni las estrellas son limpias delante de sus ojos;\n" +
                    "6 ¿Cuánto menos el hombre, que es un gusano,\n" +
                    "Y el hijo de hombre, también gusano?";
        }
        if (c==26) {
            cap = "Job proclama la soberanía de Dios\n\n" +
                    "26  Respondió Job, y dijo:\n" +
                    "2 ¿En qué ayudaste al que no tiene poder?\n" +
                    "¿Cómo has amparado al brazo sin fuerza?\n" +
                    "3 ¿En qué aconsejaste al que no tiene ciencia,\n" +
                    "Y qué plenitud de inteligencia has dado a conocer?\n" +
                    "4 ¿A quién has anunciado palabras,\n" +
                    "Y de quién es el espíritu que de ti procede?\n" +
                    "5 Las sombras tiemblan en lo profundo,\n" +
                    "Los mares y cuanto en ellos mora.\n" +
                    "6 El Seol está descubierto delante de él, y el Abadón no tiene cobertura.\n" +
                    "7 El extiende el norte sobre vacío,\n" +
                    "Cuelga la tierra sobre nada.\n" +
                    "8 Ata las aguas en sus nubes,\n" +
                    "Y las nubes no se rompen debajo de ellas.\n" +
                    "9 El encubre la faz de su trono,\n" +
                    "Y sobre él extiende su nube.\n" +
                    "10 Puso límite a la superficie de las aguas,\n" +
                    "Hasta el fin de la luz y las tinieblas.\n" +
                    "11 Las columnas del cielo tiemblan,\n" +
                    "Y se espantan a su reprensión.\n" +
                    "12 El agita el mar con su poder,\n" +
                    "Y con su entendimiento hiere la arrogancia suya.\n" +
                    "13 Su espíritu adornó los cielos;\n" +
                    "Su mano creó la serpiente tortuosa.\n" +
                    "14 He aquí, estas cosas son sólo los bordes de sus caminos;\n" +
                    "!!Y cuán leve es el susurro que hemos oído de él!\n" +
                    "Pero el trueno de su poder, ¿quién lo puede comprender?";
        }

            if (c==27){

                cap = "Job describe el castigo de los malos \n" +
                        "\n" +
                        "27:1 Reasumió Job su discurso, y dijo: \n" +
                        "27:2 Vive Dios, que ha quitado mi derecho, \n" +
                        "Y el Omnipotente, que amargó el alma mía, \n" +
                        "27:3 Que todo el tiempo que mi alma esté en mí, \n" +
                        "Y haya hálito de Dios en mis narices, \n" +
                        "27:4 Mis labios no hablarán iniquidad, \n" +
                        "Ni mi lengua pronunciará engaño. \n" +
                        "27:5 Nunca tal acontezca que yo os justifique; \n" +
                        "Hasta que muera, no quitaré de mí mi integridad. \n" +
                        "27:6 Mi justicia tengo asida, y no la cederé; \n" +
                        "No me reprochará mi corazón en todos mis días. \n" +
                        "27:7 Sea como el impío mi enemigo, \n" +
                        "Y como el inicuo mi adversario. \n" +
                        "27:8 Porque ¿cuál es la esperanza del impío, por mucho que hubiere robado, \n" +
                        "Cuando Dios le quitare la vida? \n" +
                        "27:9 ¿Oirá Dios su clamor \n" +
                        "Cuando la tribulación viniere sobre él? \n" +
                        "27:10 ¿Se deleitará en el Omnipotente? \n" +
                        "¿Invocará a Dios en todo tiempo? \n" +
                        "27:11 Yo os enseñaré en cuanto a la mano de Dios; \n" +
                        "No esconderé lo que hay para con el Omnipotente. \n" +
                        "27:12 He aquí que todos vosotros lo habéis visto; \n" +
                        "¿Por qué, pues, os habéis hecho tan enteramente vanos? \n" +
                        "27:13 Esta es para con Dios la porción del hombre impío, \n" +
                        "Y la herencia que los violentos han de recibir del Omnipotente: \n" +
                        "27:14 Si sus hijos fueren multiplicados, serán para la espada; \n" +
                        "Y sus pequeños no se saciarán de pan. \n" +
                        "27:15 Los que de él quedaren, en muerte serán sepultados, \n" +
                        "Y no los llorarán sus viudas. \n" +
                        "27:16 Aunque amontone plata como polvo, \n" +
                        "Y prepare ropa como lodo; \n" +
                        "27:17 La habrá preparado él, mas el justo se vestirá, \n" +
                        "Y el inocente repartirá la plata. \n" +
                        "27:18 Edificó su casa como la polilla, \n" +
                        "Y como enramada que hizo el guarda. \n" +
                        "27:19 Rico se acuesta, pero por última vez; \n" +
                        "Abrirá sus ojos, y nada tendrá. \n" +
                        "27:20 Se apoderarán de él terrores como aguas; \n" +
                        "Torbellino lo arrebatará de noche. \n" +
                        "27:21 Le eleva el solano, y se va; \n" +
                        "Y tempestad lo arrebatará de su lugar. \n" +
                        "27:22 Dios, pues, descargará sobre él, y no perdonará; \n" +
                        "Hará él por huir de su mano. \n" +
                        "27:23 Batirán las manos sobre él, \n" +
                        "Y desde su lugar le silbarán.\n" +
                        "\n" +
                        "   ";
            }

            if (c==28){

                    cap = "El hombre en busca de la sabiduría \n" +
                            "\n" +
                            "28:1 Ciertamente la plata tiene sus veneros, \n" +
                            "Y el oro lugar donde se refina. \n" +
                            "28:2 El hierro se saca del polvo, \n" +
                            "Y de la piedra se funde el cobre. \n" +
                            "28:3 A las tinieblas ponen término, \n" +
                            "Y examinan todo a la perfección, \n" +
                            "Las piedras que hay en oscuridad y en sombra de muerte. \n" +
                            "28:4 Abren minas lejos de lo habitado, \n" +
                            "En lugares olvidados, donde el pie no pasa. \n" +
                            "Son suspendidos y balanceados, lejos de los demás hombres. \n" +
                            "28:5 De la tierra nace el pan, \n" +
                            "Y debajo de ella está como convertida en fuego. \n" +
                            "28:6 Lugar hay cuyas piedras son zafiro, \n" +
                            "Y sus polvos de oro. \n" +
                            "28:7 Senda que nunca la conoció ave, \n" +
                            "Ni ojo de buitre la vio; \n" +
                            "28:8 Nunca la pisaron animales fieros, \n" +
                            "Ni león pasó por ella. \n" +
                            "28:9 En el pedernal puso su mano, \n" +
                            "Y trastornó de raíz los montes. \n" +
                            "28:10 De los peñascos cortó ríos, \n" +
                            "Y sus ojos vieron todo lo preciado. \n" +
                            "28:11 Detuvo los ríos en su nacimiento, \n" +
                            "E hizo salir a luz lo escondido. \n" +
                            "28:12 Mas ¿dónde se hallará la sabiduría? \n" +
                            "¿Dónde está el lugar de la inteligencia? \n" +
                            "28:13 No conoce su valor el hombre, \n" +
                            "Ni se halla en la tierra de los vivientes. \n" +
                            "28:14 El abismo dice: No está en mí; \n" +
                            "Y el mar dijo: Ni conmigo. \n" +
                            "28:15 No se dará por oro, \n" +
                            "Ni su precio será a peso de plata. \n" +
                            "28:16 No puede ser apreciada con oro de Ofir, \n" +
                            "Ni con ónice precioso, ni con zafiro. \n" +
                            "28:17 El oro no se le igualará, ni el diamante, \n" +
                            "Ni se cambiará por alhajas de oro fino. \n" +
                            "28:18 No se hará mención de coral ni de perlas; \n" +
                            "La sabiduría es mejor que las piedras preciosas. \n" +
                            "28:19 No se igualará con ella topacio de Etiopía; \n" +
                            "No se podrá apreciar con oro fino. \n" +
                            "28:20 ¿De dónde, pues, vendrá la sabiduría? \n" +
                            "¿Y dónde está el lugar de la inteligencia? \n" +
                            "28:21 Porque encubierta está a los ojos de todo viviente, \n" +
                            "Y a toda ave del cielo es oculta. \n" +
                            "28:22 El Abadón y la muerte dijeron: \n" +
                            "Su fama hemos oído con nuestros oídos. \n" +
                            "28:23 Dios entiende el camino de ella, \n" +
                            "Y conoce su lugar. \n" +
                            "28:24 Porque él mira hasta los fines de la tierra, \n" +
                            "Y ve cuanto hay bajo los cielos. \n" +
                            "28:25 Al dar peso al viento, \n" +
                            "Y poner las aguas por medida; \n" +
                            "28:26 Cuando él dio ley a la lluvia, \n" +
                            "Y camino al relámpago de los truenos, \n" +
                            "28:27 Entonces la veía él, y la manifestaba; \n" +
                            "La preparó y la descubrió también. \n" +
                            "28:28 Y dijo al hombre: \n" +
                            "He aquí que el temor del Señor es la sabiduría, \n" +
                            "Y el apartarse del mal, la inteligencia.";
            }

            if (c==29){

                    cap = "\n" +
                            "Job recuerda su felicidad anterior \n" +
                            "\n" +
                            "29:1 Volvió Job a reanudar su discurso, y dijo: \n" +
                            "29:2 ¡Quién me volviese como en los meses pasados, \n" +
                            "Como en los días en que Dios me guardaba, \n" +
                            "29:3 Cuando hacía resplandecer sobre mi cabeza su lámpara, \n" +
                            "A cuya luz yo caminaba en la oscuridad; \n" +
                            "29:4 Como fui en los días de mi juventud, \n" +
                            "Cuando el favor de Dios velaba sobre mi tienda; \n" +
                            "29:5 Cuando aún estaba conmigo el Omnipotente, \n" +
                            "Y mis hijos alrededor de mí; \n" +
                            "29:6 Cuando lavaba yo mis pasos con leche, \n" +
                            "Y la piedra me derramaba ríos de aceite! \n" +
                            "29:7 Cuando yo salía a la puerta a juicio, \n" +
                            "Y en la plaza hacía preparar mi asiento, \n" +
                            "29:8 Los jóvenes me veían, y se escondían; \n" +
                            "Y los ancianos se levantaban, y estaban de pie. \n" +
                            "29:9 Los príncipes detenían sus palabras; \n" +
                            "Ponían la mano sobre su boca. \n" +
                            "29:10 La voz de los principales se apagaba, \n" +
                            "Y su lengua se pegaba a su paladar. \n" +
                            "29:11 Los oídos que me oían me llamaban bienaventurado, \n" +
                            "Y los ojos que me veían me daban testimonio, \n" +
                            "29:12 Porque yo libraba al pobre que clamaba, \n" +
                            "Y al huérfano que carecía de ayudador. \n" +
                            "29:13 La bendición del que se iba a perder venía sobre mí, \n" +
                            "Y al corazón de la viuda yo daba alegría. \n" +
                            "29:14 Me vestía de justicia, y ella me cubría; \n" +
                            "Como manto y diadema era mi rectitud. \n" +
                            "29:15 Yo era ojos al ciego, \n" +
                            "Y pies al cojo. \n" +
                            "29:16 A los menesterosos era padre, \n" +
                            "Y de la causa que no entendía, me informaba con diligencia; \n" +
                            "29:17 Y quebrantaba los colmillos del inicuo, \n" +
                            "Y de sus dientes hacía soltar la presa. \n" +
                            "29:18 Decía yo: En mi nido moriré, \n" +
                            "Y como arena multiplicaré mis días. \n" +
                            "29:19 Mi raíz estaba abierta junto a las aguas, \n" +
                            "Y en mis ramas permanecía el rocío. \n" +
                            "29:20 Mi honra se renovaba en mí, \n" +
                            "Y mi arco se fortalecía en mi mano. \n" +
                            "29:21 Me oían, y esperaban, \n" +
                            "Y callaban a mi consejo. \n" +
                            "29:22 Tras mi palabra no replicaban, \n" +
                            "Y mi razón destilaba sobre ellos. \n" +
                            "29:23 Me esperaban como a la lluvia, \n" +
                            "Y abrían su boca como a la lluvia tardía. \n" +
                            "29:24 Si me reía con ellos, no lo creían; \n" +
                            "Y no abatían la luz de mi rostro. \n" +
                            "29:25 Calificaba yo el camino de ellos, y me sentaba entre ellos como el jefe; \n" +
                            "Y moraba como rey en el ejército, \n" +
                            "Como el que consuela a los que lloran.\n" +
                            "\n" +
                            "  \n ";
            }

            if (c==30){

                    cap = "Job lamenta su desdicha actual \n" +
                            "\n" +
                            "30:1 Pero ahora se ríen de mí los más jóvenes que yo, \n" +
                            "A cuyos padres yo desdeñara poner con los perros de mi ganado. \n" +
                            "30:2 ¿Y de qué me serviría ni aun la fuerza de sus manos? \n" +
                            "No tienen fuerza alguna. \n" +
                            "30:3 Por causa de la pobreza y del hambre andaban solos; \n" +
                            "Huían a la soledad, a lugar tenebroso, asolado y desierto. \n" +
                            "30:4 Recogían malvas entre los arbustos, \n" +
                            "Y raíces de enebro para calentarse. \n" +
                            "30:5 Eran arrojados de entre las gentes, \n" +
                            "Y todos les daban grita como tras el ladrón. \n" +
                            "30:6 Habitaban en las barrancas de los arroyos, \n" +
                            "En las cavernas de la tierra, y en las rocas. \n" +
                            "30:7 Bramaban entre las matas, \n" +
                            "Y se reunían debajo de los espinos. \n" +
                            "30:8 Hijos de viles, y hombres sin nombre, \n" +
                            "Más bajos que la misma tierra. \n" +
                            "30:9 Y ahora yo soy objeto de su burla, \n" +
                            "Y les sirvo de refrán. \n" +
                            "30:10 Me abominan, se alejan de mí, \n" +
                            "Y aun de mi rostro no detuvieron su saliva. \n" +
                            "30:11 Porque Dios desató su cuerda, y me afligió, \n" +
                            "Por eso se desenfrenaron delante de mi rostro. \n" +
                            "30:12 A la mano derecha se levantó el populacho; \n" +
                            "Empujaron mis pies, \n" +
                            "Y prepararon contra mí caminos de perdición. \n" +
                            "30:13 Mi senda desbarataron, \n" +
                            "Se aprovecharon de mi quebrantamiento, \n" +
                            "Y contra ellos no hubo ayudador. \n" +
                            "30:14 Vinieron como por portillo ancho, \n" +
                            "Se revolvieron sobre mi calamidad. \n" +
                            "30:15 Se han revuelto turbaciones sobre mí; \n" +
                            "Combatieron como viento mi honor, \n" +
                            "Y mi prosperidad pasó como nube. \n" +
                            "30:16 Y ahora mi alma está derramada en mí; \n" +
                            "Días de aflicción se apoderan de mí. \n" +
                            "30:17 La noche taladra mis huesos, \n" +
                            "Y los dolores que me roen no reposan. \n" +
                            "30:18 La violencia deforma mi vestidura; me ciñe como el cuello de mi túnica. \n" +
                            "30:19 El me derribó en el lodo, \n" +
                            "Y soy semejante al polvo y a la ceniza. \n" +
                            "30:20 Clamo a ti, y no me oyes; \n" +
                            "Me presento, y no me atiendes. \n" +
                            "30:21 Te has vuelto cruel para mí; \n" +
                            "Con el poder de tu mano me persigues. \n" +
                            "30:22 Me alzaste sobre el viento, me hiciste cabalgar en él, \n" +
                            "Y disolviste mi sustancia. \n" +
                            "30:23 Porque yo sé que me conduces a la muerte, \n" +
                            "Y a la casa determinada a todo viviente. \n" +
                            "30:24 Mas él no extenderá la mano contra el sepulcro; \n" +
                            "¿Clamarán los sepultados cuando él los quebrantare? \n" +
                            "30:25 ¿No lloré yo al afligido? \n" +
                            "Y mi alma, ¿no se entristeció sobre el menesteroso? \n" +
                            "30:26 Cuando esperaba yo el bien, entonces vino el mal; \n" +
                            "Y cuando esperaba luz, vino la oscuridad. \n" +
                            "30:27 Mis entrañas se agitan, y no reposan; \n" +
                            "Días de aflicción me han sobrecogido. \n" +
                            "30:28 Ando ennegrecido, y no por el sol; \n" +
                            "Me he levantado en la congregación, y clamado. \n" +
                            "30:29 He venido a ser hermano de chacales, \n" +
                            "Y compañero de avestruces. \n" +
                            "30:30 Mi piel se ha ennegrecido y se me cae, \n" +
                            "Y mis huesos arden de calor. \n" +
                            "30:31 Se ha cambiado mi arpa en luto, \n" +
                            "Y mi flauta en voz de lamentadores. ";
            }

            if (c==31){

                    cap = "Job afirma su integridad \n" +
                            "\n" +
                            "31:1 Hice pacto con mis ojos; \n" +
                            "¿Cómo, pues, había yo de mirar a una virgen? \n" +
                            "31:2 Porque ¿qué galardón me daría de arriba Dios, \n" +
                            "Y qué heredad el Omnipotente desde las alturas? \n" +
                            "31:3 ¿No hay quebrantamiento para el impío, \n" +
                            "Y extrañamiento para los que hacen iniquidad? \n" +
                            "31:4 ¿No ve él mis caminos, \n" +
                            "Y cuenta todos mis pasos? \n" +
                            "31:5 Si anduve con mentira, \n" +
                            "Y si mi pie se apresuró a engaño, \n" +
                            "31:6 Péseme Dios en balanzas de justicia, \n" +
                            "Y conocerá mi integridad. \n" +
                            "31:7 Si mis pasos se apartaron del camino, \n" +
                            "Si mi corazón se fue tras mis ojos, \n" +
                            "Y si algo se pegó a mis manos, \n" +
                            "31:8 Siembre yo, y otro coma, \n" +
                            "Y sea arrancada mi siembra. \n" +
                            "31:9 Si fue mi corazón engañado acerca de mujer, \n" +
                            "Y si estuve acechando a la puerta de mi prójimo, \n" +
                            "31:10 Muela para otro mi mujer, \n" +
                            "Y sobre ella otros se encorven. \n" +
                            "31:11 Porque es maldad e iniquidad \n" +
                            "Que han de castigar los jueces. \n" +
                            "31:12 Porque es fuego que devoraría hasta el Abadón, \n" +
                            "Y consumiría toda mi hacienda. \n" +
                            "31:13 Si hubiera tenido en poco el derecho de mi siervo y de mi sierva, \n" +
                            "Cuando ellos contendían conmigo, \n" +
                            "31:14 ¿Qué haría yo cuando Dios se levantase? \n" +
                            "Y cuando él preguntara, ¿qué le respondería yo? \n" +
                            "31:15 El que en el vientre me hizo a mí, ¿no lo hizo a él? \n" +
                            "¿Y no nos dispuso uno mismo en la matriz? \n" +
                            "31:16 Si estorbé el contento de los pobres, \n" +
                            "E hice desfallecer los ojos de la viuda; \n" +
                            "31:17 Si comí mi bocado solo, \n" +
                            "Y no comió de él el huérfano \n" +
                            "31:18 (Porque desde mi juventud creció conmigo como con un padre, \n" +
                            "Y desde el vientre de mi madre fui guía de la viuda); \n" +
                            "31:19 Si he visto que pereciera alguno sin vestido, \n" +
                            "Y al menesteroso sin abrigo; \n" +
                            "31:20 Si no me bendijeron sus lomos, \n" +
                            "Y del vellón de mis ovejas se calentaron; \n" +
                            "31:21 Si alcé contra el huérfano mi mano, \n" +
                            "Aunque viese que me ayudaran en la puerta; \n" +
                            "31:22 Mi espalda se caiga de mi hombro, \n" +
                            "Y el hueso de mi brazo sea quebrado. \n" +
                            "31:23 Porque temí el castigo de Dios, \n" +
                            "Contra cuya majestad yo no tendría poder. \n" +
                            "31:24 Si puse en el oro mi esperanza, \n" +
                            "Y dije al oro: Mi confianza eres tú; \n" +
                            "31:25 Si me alegré de que mis riquezas se multiplicasen, \n" +
                            "Y de que mi mano hallase mucho; \n" +
                            "31:26 Si he mirado al sol cuando resplandecía, \n" +
                            "O a la luna cuando iba hermosa, \n" +
                            "31:27 Y mi corazón se engañó en secreto, \n" +
                            "Y mi boca besó mi mano; \n" +
                            "31:28 Esto también sería maldad juzgada; \n" +
                            "Porque habría negado al Dios soberano. \n" +
                            "31:29 Si me alegré en el quebrantamiento del que me aborrecía, \n" +
                            "Y me regocijé cuando le halló el mal \n" +
                            "31:30 (Ni aun entregué al pecado mi lengua, \n" +
                            "Pidiendo maldición para su alma); \n" +
                            "31:31 Si mis siervos no decían: \n" +
                            "¿Quién no se ha saciado de su carne? \n" +
                            "31:32 (El forastero no pasaba fuera la noche; \n" +
                            "Mis puertas abría al caminante); \n" +
                            "31:33 Si encubrí como hombre mis transgresiones, \n" +
                            "Escondiendo en mi seno mi iniquidad, \n" +
                            "31:34 Porque tuve temor de la gran multitud, \n" +
                            "Y el menosprecio de las familias me atemorizó, \n" +
                            "Y callé, y no salí de mi puerta; \n" +
                            "31:35 ¡Quién me diera quien me oyese! \n" +
                            "He aquí mi confianza es que el Omnipotente testificará por mí, \n" +
                            "Aunque mi adversario me forme proceso. \n" +
                            "31:36 Ciertamente yo lo llevaría sobre mi hombro, \n" +
                            "Y me lo ceñiría como una corona. \n" +
                            "31:37 Yo le contaría el número de mis pasos, \n" +
                            "Y como príncipe me presentaría ante él. \n" +
                            "31:38 Si mi tierra clama contra mí, \n" +
                            "Y lloran todos sus surcos; \n" +
                            "31:39 Si comí su sustancia sin dinero, \n" +
                            "O afligí el alma de sus dueños, \n" +
                            "31:40 En lugar de trigo me nazcan abrojos, \n" +
                            "Y espinos en lugar de cebada. \n" +
                            "Aquí terminan las palabras de Job.\n" +
                            "\n" +
                            "\n ";
            }

            if (c==32){

                    cap = "Eliú justifica su derecho de contestar a Job\n" +
                            "32:1 Cesaron estos tres varones de responder a Job, por cuanto él era justo a sus propios ojos. \n" +
                            "32:2 Entonces Eliú hijo de Baraquel buzita, de la familia de Ram, se encendió en ira contra Job; se encendió en ira, por cuanto se justificaba a sí mismo más que a Dios. \n" +
                            "32:3 Asimismo se encendió en ira contra sus tres amigos, porque no hallaban qué responder, aunque habían condenado a Job. \n" +
                            "32:4 Y Eliú había esperado a Job en la disputa, porque los otros eran más viejos que él. \n" +
                            "32:5 Pero viendo Eliú que no había respuesta en la boca de aquellos tres varones, se encendió en ira. \n" +
                            "32:6 Y respondió Eliú hijo de Baraquel buzita, y dijo: \n" +
                            "Yo soy joven, y vosotros ancianos; \n" +
                            "Por tanto, he tenido miedo, y he temido declararos mi opinión. \n" +
                            "32:7 Yo decía: Los días hablarán, \n" +
                            "Y la muchedumbre de años declarará sabiduría. \n" +
                            "32:8 Ciertamente espíritu hay en el hombre, \n" +
                            "Y el soplo del Omnipotente le hace que entienda. \n" +
                            "32:9 No son los sabios los de mucha edad, \n" +
                            "Ni los ancianos entienden el derecho. \n" +
                            "32:10 Por tanto, yo dije: Escuchadme; \n" +
                            "Declararé yo también mi sabiduría. \n" +
                            "32:11 He aquí yo he esperado a vuestras razones, \n" +
                            "He escuchado vuestros argumentos, \n" +
                            "En tanto que buscabais palabras. \n" +
                            "32:12 Os he prestado atención, \n" +
                            "Y he aquí que no hay de vosotros quien redarguya a Job, \n" +
                            "Y responda a sus razones. \n" +
                            "32:13 Para que no digáis: Nosotros hemos hallado sabiduría; \n" +
                            "Lo vence Dios, no el hombre. \n" +
                            "32:14 Ahora bien, Job no dirigió contra mí sus palabras, \n" +
                            "Ni yo le responderé con vuestras razones. \n" +
                            "32:15 Se espantaron, no respondieron más; \n" +
                            "Se les fueron los razonamientos. \n" +
                            "32:16 Yo, pues, he esperado, pero no hablaban; \n" +
                            "Más bien callaron y no respondieron más. \n" +
                            "32:17 Por eso yo también responderé mi parte; \n" +
                            "También yo declararé mi juicio. \n" +
                            "32:18 Porque lleno estoy de palabras, \n" +
                            "Y me apremia el espíritu dentro de mí. \n" +
                            "32:19 De cierto mi corazón está como el vino que no tiene respiradero, \n" +
                            "Y se rompe como odres nuevos. \n" +
                            "32:20 Hablaré, pues, y respiraré; \n" +
                            "Abriré mis labios, y responderé. \n" +
                            "32:21 No haré ahora acepción de personas, \n" +
                            "Ni usaré con nadie de títulos lisonjeros. \n" +
                            "32:22 Porque no sé hablar lisonjas; \n" +
                            "De otra manera, en breve mi Hacedor me consumiría.\n" +
                            "   ";
            }

            if (c==33){

                    cap = "Eliú censura a Job \n" +
                            "\n" +
                            "33:1 Por tanto, Job, oye ahora mis razones, \n" +
                            "Y escucha todas mis palabras. \n" +
                            "33:2 He aquí yo abriré ahora mi boca, \n" +
                            "Y mi lengua hablará en mi garganta. \n" +
                            "33:3 Mis razones declararán la rectitud de mi corazón, \n" +
                            "Y lo que saben mis labios, lo hablarán con sinceridad. \n" +
                            "33:4 El espíritu de Dios me hizo, \n" +
                            "Y el soplo del Omnipotente me dio vida. \n" +
                            "33:5 Respóndeme si puedes; \n" +
                            "Ordena tus palabras, ponte en pie. \n" +
                            "33:6 Heme aquí a mí en lugar de Dios, conforme a tu dicho; \n" +
                            "De barro fui yo también formado. \n" +
                            "33:7 He aquí, mi terror no te espantará, \n" +
                            "Ni mi mano se agravará sobre ti. \n" +
                            "33:8 De cierto tú dijiste a oídos míos, \n" +
                            "Y yo oí la voz de tus palabras que decían: \n" +
                            "33:9 Yo soy limpio y sin defecto; \n" +
                            "Soy inocente, y no hay maldad en mí. \n" +
                            "33:10 He aquí que él buscó reproches contra mí, \n" +
                            "Y me tiene por su enemigo; \n" +
                            "33:11 Puso mis pies en el cepo, \n" +
                            "Y vigiló todas mis sendas. \n" +
                            "33:12 He aquí, en esto no has hablado justamente; \n" +
                            "Yo te responderé que mayor es Dios que el hombre. \n" +
                            "33:13 ¿Por qué contiendes contra él? \n" +
                            "Porque él no da cuenta de ninguna de sus razones. \n" +
                            "33:14 Sin embargo, en una o en dos maneras habla Dios; \n" +
                            "Pero el hombre no entiende. \n" +
                            "33:15 Por sueño, en visión nocturna, \n" +
                            "Cuando el sueño cae sobre los hombres, \n" +
                            "Cuando se adormecen sobre el lecho, \n" +
                            "33:16 Entonces revela al oído de los hombres, \n" +
                            "Y les señala su consejo, \n" +
                            "33:17 Para quitar al hombre de su obra, \n" +
                            "Y apartar del varón la soberbia. \n" +
                            "33:18 Detendrá su alma del sepulcro, \n" +
                            "Y su vida de que perezca a espada. \n" +
                            "33:19 También sobre su cama es castigado \n" +
                            "Con dolor fuerte en todos sus huesos, \n" +
                            "33:20 Que le hace que su vida aborrezca el pan, \n" +
                            "Y su alma la comida suave. \n" +
                            "33:21 Su carne desfallece, de manera que no se ve, \n" +
                            "Y sus huesos, que antes no se veían, aparecen. \n" +
                            "33:22 Su alma se acerca al sepulcro, \n" +
                            "Y su vida a los que causan la muerte. \n" +
                            "33:23 Si tuviese cerca de él \n" +
                            "Algún elocuente mediador muy escogido, \n" +
                            "Que anuncie al hombre su deber; \n" +
                            "33:24 Que le diga que Dios tuvo de él misericordia, \n" +
                            "Que lo libró de descender al sepulcro, \n" +
                            "Que halló redención; \n" +
                            "33:25 Su carne será más tierna que la del niño, \n" +
                            "Volverá a los días de su juventud. \n" +
                            "33:26 Orará a Dios, y éste le amará, \n" +
                            "Y verá su faz con júbilo; \n" +
                            "Y restaurará al hombre su justicia. \n" +
                            "33:27 El mira sobre los hombres; y al que dijere: \n" +
                            "Pequé, y pervertí lo recto, \n" +
                            "Y no me ha aprovechado, \n" +
                            "33:28 Dios redimirá su alma para que no pase al sepulcro, \n" +
                            "Y su vida se verá en luz. \n" +
                            "33:29 He aquí, todas estas cosas hace Dios \n" +
                            "Dos y tres veces con el hombre, \n" +
                            "33:30 Para apartar su alma del sepulcro, \n" +
                            "Y para iluminarlo con la luz de los vivientes. \n" +
                            "33:31 Escucha, Job, y óyeme; \n" +
                            "Calla, y yo hablaré. \n" +
                            "33:32 Si tienes razones, respóndeme; \n" +
                            "Habla, porque yo te quiero justificar. \n" +
                            "33:33 Y si no, óyeme tú a mí; \n" +
                            "Calla, y te enseñaré sabiduría.\n" +
                            "\n" +
                            "  \n ";
            }

            if (c==34){

                    cap = "Eliú justifica a Dios \n" +
                            "\n" +
                            "34:1 Además Eliú dijo: \n" +
                            "34:2 Oíd, sabios, mis palabras; \n" +
                            "Y vosotros, doctos, estadme atentos. \n" +
                            "34:3 Porque el oído prueba las palabras, \n" +
                            "Como el paladar gusta lo que uno come. \n" +
                            "34:4 Escojamos para nosotros el juicio, \n" +
                            "Conozcamos entre nosotros cuál sea lo bueno. \n" +
                            "34:5 Porque Job ha dicho: Yo soy justo, \n" +
                            "Y Dios me ha quitado mi derecho. \n" +
                            "34:6 ¿He de mentir yo contra mi razón? \n" +
                            "Dolorosa es mi herida sin haber hecho yo transgresión. \n" +
                            "34:7 ¿Qué hombre hay como Job, \n" +
                            "Que bebe el escarnio como agua, \n" +
                            "34:8 Y va en compañía con los que hacen iniquidad, \n" +
                            "Y anda con los hombres malos? \n" +
                            "34:9 Porque ha dicho: De nada servirá al hombre \n" +
                            "El conformar su voluntad a Dios. \n" +
                            "34:10 Por tanto, varones de inteligencia, oídme: \n" +
                            "Lejos esté de Dios la impiedad, \n" +
                            "Y del Omnipotente la iniquidad. \n" +
                            "34:11 Porque él pagará al hombre según su obra, \n" +
                            "Y le retribuirá conforme a su camino. \n" +
                            "34:12 Sí, por cierto, Dios no hará injusticia, \n" +
                            "Y el Omnipotente no pervertirá el derecho. \n" +
                            "34:13 ¿Quién visitó por él la tierra? \n" +
                            "¿Y quién puso en orden todo el mundo? \n" +
                            "34:14 Si él pusiese sobre el hombre su corazón, \n" +
                            "Y recogiese así su espíritu y su aliento, \n" +
                            "34:15 Toda carne perecería juntamente, \n" +
                            "Y el hombre volvería al polvo. \n" +
                            "34:16 Si, pues, hay en ti entendimiento, oye esto; \n" +
                            "Escucha la voz de mis palabras. \n" +
                            "34:17 ¿Gobernará el que aborrece juicio? \n" +
                            "¿Y condenarás tú al que es tan justo? \n" +
                            "34:18 ¿Se dirá al rey: Perverso; \n" +
                            "Y a los príncipes: Impíos? \n" +
                            "34:19 ¿Cuánto menos a aquel que no hace acepción de personas de príncipes. \n" +
                            "Ni respeta más al rico que al pobre, \n" +
                            "Porque todos son obra de sus manos? \n" +
                            "34:20 En un momento morirán, \n" +
                            "Y a medianoche se alborotarán los pueblos, y pasarán, \n" +
                            "Y sin mano será quitado el poderoso. \n" +
                            "34:21 Porque sus ojos están sobre los caminos del hombre, \n" +
                            "Y ve todos sus pasos. \n" +
                            "34:22 No hay tinieblas ni sombra de muerte \n" +
                            "Donde se escondan los que hacen maldad. \n" +
                            "34:23 No carga, pues, él al hombre más de lo justo, \n" +
                            "Para que vaya con Dios a juicio. \n" +
                            "34:24 El quebrantará a los fuertes sin indagación, \n" +
                            "Y hará estar a otros en su lugar. \n" +
                            "34:25 Por tanto, él hará notorias las obras de ellos, \n" +
                            "Cuando los trastorne en la noche, y sean quebrantados. \n" +
                            "34:26 Como a malos los herirá \n" +
                            "En lugar donde sean vistos; \n" +
                            "34:27 Por cuanto así se apartaron de él, \n" +
                            "Y no consideraron ninguno de sus caminos, \n" +
                            "34:28 Haciendo venir delante de él el clamor del pobre, \n" +
                            "Y que oiga el clamor de los necesitados. \n" +
                            "34:29 Si él diere reposo, ¿quién inquietará? \n" +
                            "Si escondiere el rostro, ¿quién lo mirará? \n" +
                            "Esto sobre una nación, y lo mismo sobre un hombre; \n" +
                            "34:30 Haciendo que no reine el hombre impío \n" +
                            "Para vejaciones del pueblo. \n" +
                            "34:31 De seguro conviene que se diga a Dios: \n" +
                            "He llevado ya castigo, no ofenderé ya más; \n" +
                            "34:32 Enséñame tú lo que yo no veo; \n" +
                            "Si hice mal, no lo haré más. \n" +
                            "34:33 ¿Ha de ser eso según tu parecer? \n" +
                            "El te retribuirá, ora rehúses, ora aceptes, y no yo; \n" +
                            "Di, si no, lo que tú sabes. \n" +
                            "34:34 Los hombres inteligentes dirán conmigo, \n" +
                            "Y el hombre sabio que me oiga: \n" +
                            "34:35 Que Job no habla con sabiduría, \n" +
                            "Y que sus palabras no son con entendimiento. \n" +
                            "34:36 Deseo yo que Job sea probado ampliamente, \n" +
                            "A causa de sus respuestas semejantes a las de los hombres inicuos. \n" +
                            "34:37 Porque a su pecado añadió rebeldía; \n" +
                            "Bate palmas contra nosotros, \n" +
                            "Y contra Dios multiplica sus palabras.\n" +
                            "\n" +
                            "  \n ";
            }

            if (c==35){

                    cap = "35:1 Prosiguió Eliú en su razonamiento, y dijo: \n" +
                            "35:2 ¿Piensas que es cosa recta lo que has dicho: \n" +
                            "Más justo soy yo que Dios? \n" +
                            "35:3 Porque dijiste: ¿Qué ventaja sacaré de ello? \n" +
                            "¿O qué provecho tendré de no haber pecado? \n" +
                            "35:4 Yo te responderé razones, \n" +
                            "Y a tus compañeros contigo. \n" +
                            "35:5 Mira a los cielos, y ve, \n" +
                            "Y considera que las nubes son más altas que tú. \n" +
                            "35:6 Si pecares, ¿qué habrás logrado contra él? \n" +
                            "Y si tus rebeliones se multiplicaren, ¿qué le harás tú? \n" +
                            "35:7 Si fueres justo, ¿qué le darás a él? \n" +
                            "¿O qué recibirá de tu mano? \n" +
                            "35:8 Al hombre como tú dañará tu impiedad, \n" +
                            "Y al hijo de hombre aprovechará tu justicia. \n" +
                            "35:9 A causa de la multitud de las violencias claman, \n" +
                            "Y se lamentan por el poderío de los grandes. \n" +
                            "35:10 Y ninguno dice: ¿Dónde está Dios mi Hacedor, \n" +
                            "Que da cánticos en la noche, \n" +
                            "35:11 Que nos enseña más que a las bestias de la tierra, \n" +
                            "Y nos hace sabios más que a las aves del cielo? \n" +
                            "35:12 Allí clamarán, y él no oirá, \n" +
                            "Por la soberbia de los malos. \n" +
                            "35:13 Ciertamente Dios no oirá la vanidad, \n" +
                            "Ni la mirará el Omnipotente. \n" +
                            "35:14 ¿Cuánto menos cuando dices que no haces caso de él? \n" +
                            "La causa está delante de él; por tanto, aguárdale. \n" +
                            "35:15 Mas ahora, porque en su ira no castiga, \n" +
                            "Ni inquiere con rigor, \n" +
                            "35:16 Por eso Job abre su boca vanamente, \n" +
                            "Y multiplica palabras sin sabiduría.\n" +
                            "\n" +
                            "   ";
            }

            if (c==36){

                    cap = "Eliú exalta la grandeza de Dios \n" +
                            "\n" +
                            "36:1 Añadió Eliú y dijo: \n" +
                            "36:2 Espérame un poco, y te enseñaré; \n" +
                            "Porque todavía tengo razones en defensa de Dios. \n" +
                            "36:3 Tomaré mi saber desde lejos, \n" +
                            "Y atribuiré justicia a mi Hacedor. \n" +
                            "36:4 Porque de cierto no son mentira mis palabras; \n" +
                            "Contigo está el que es íntegro en sus conceptos. \n" +
                            "36:5 He aquí que Dios es grande, pero no desestima a nadie; \n" +
                            "Es poderoso en fuerza de sabiduría. \n" +
                            "36:6 No otorgará vida al impío, \n" +
                            "Pero a los afligidos dará su derecho. \n" +
                            "36:7 No apartará de los justos sus ojos; \n" +
                            "Antes bien con los reyes los pondrá en trono para siempre, \n" +
                            "Y serán exaltados. \n" +
                            "36:8 Y si estuvieren prendidos en grillos, \n" +
                            "Y aprisionados en las cuerdas de aflicción, \n" +
                            "36:9 El les dará a conocer la obra de ellos, \n" +
                            "Y que prevalecieron sus rebeliones. \n" +
                            "36:10 Despierta además el oído de ellos para la corrección, \n" +
                            "Y les dice que se conviertan de la iniquidad. \n" +
                            "36:11 Si oyeren, y le sirvieren, \n" +
                            "Acabarán sus días en bienestar, \n" +
                            "Y sus años en dicha. \n" +
                            "36:12 Pero si no oyeren, serán pasados a espada, \n" +
                            "Y perecerán sin sabiduría. \n" +
                            "36:13 Mas los hipócritas de corazón atesoran para sí la ira, \n" +
                            "Y no clamarán cuando él los atare. \n" +
                            "36:14 Fallecerá el alma de ellos en su juventud, \n" +
                            "Y su vida entre los sodomitas. \n" +
                            "36:15 Al pobre librará de su pobreza, \n" +
                            "Y en la aflicción despertará su oído. \n" +
                            "36:16 Asimismo te apartará de la boca de la angustia \n" +
                            "A lugar espacioso, libre de todo apuro, \n" +
                            "Y te preparará mesa llena de grosura. \n" +
                            "36:17 Mas tú has llenado el juicio del impío, \n" +
                            "En vez de sustentar el juicio y la justicia. \n" +
                            "36:18 Por lo cual teme, no sea que en su ira te quite con golpe, \n" +
                            "El cual no puedas apartar de ti con gran rescate. \n" +
                            "36:19 ¿Hará él estima de tus riquezas, del oro, \n" +
                            "O de todas las fuerzas del poder? \n" +
                            "36:20 No anheles la noche, \n" +
                            "En que los pueblos desaparecen de su lugar. \n" +
                            "36:21 Guárdate, no te vuelvas a la iniquidad; \n" +
                            "Pues ésta escogiste más bien que la aflicción. \n" +
                            "36:22 He aquí que Dios es excelso en su poder; \n" +
                            "¿Qué enseñador semejante a él? \n" +
                            "36:23 ¿Quién le ha prescrito su camino? \n" +
                            "¿Y quién le dirá: Has hecho mal? \n" +
                            "36:24 Acuérdate de engrandecer su obra, \n" +
                            "La cual contemplan los hombres. \n" +
                            "36:25 Los hombres todos la ven; \n" +
                            "La mira el hombre de lejos. \n" +
                            "36:26 He aquí, Dios es grande, y nosotros no le conocemos, \n" +
                            "Ni se puede seguir la huella de sus años. \n" +
                            "36:27 El atrae las gotas de las aguas, \n" +
                            "Al transformarse el vapor en lluvia, \n" +
                            "36:28 La cual destilan las nubes, \n" +
                            "Goteando en abundancia sobre los hombres. \n" +
                            "36:29 ¿Quién podrá comprender la extensión de las nubes, \n" +
                            "Y el sonido estrepitoso de su morada? \n" +
                            "36:30 He aquí que sobre él extiende su luz, \n" +
                            "Y cobija con ella las profundidades del mar. \n" +
                            "36:31 Bien que por esos medios castiga a los pueblos, \n" +
                            "A la multitud él da sustento. \n" +
                            "36:32 Con las nubes encubre la luz, \n" +
                            "Y le manda no brillar, interponiendo aquéllas. \n" +
                            "36:33 El trueno declara su indignación, \n" +
                            "Y la tempestad proclama su ira contra la iniquidad.\n" +
                            "\n" +
                            "   ";
            }
            if (c==37){

                    cap = "37:1 Por eso también se estremece mi corazón, \n" +
                            "Y salta de su lugar. \n" +
                            "37:2 Oíd atentamente el estrépito de su voz, \n" +
                            "Y el sonido que sale de su boca. \n" +
                            "37:3 Debajo de todos los cielos lo dirige, \n" +
                            "Y su luz hasta los fines de la tierra. \n" +
                            "37:4 Después de ella brama el sonido, \n" +
                            "Truena él con voz majestuosa; \n" +
                            "Y aunque sea oída su voz, no los detiene. \n" +
                            "37:5 Truena Dios maravillosamente con su voz; \n" +
                            "El hace grandes cosas, que nosotros no entendemos. \n" +
                            "37:6 Porque a la nieve dice: Desciende a la tierra; \n" +
                            "También a la llovizna, y a los aguaceros torrenciales. \n" +
                            "37:7 Así hace retirarse a todo hombre, \n" +
                            "Para que los hombres todos reconozcan su obra. \n" +
                            "37:8 Las bestias entran en su escondrijo, \n" +
                            "Y se están en sus moradas. \n" +
                            "37:9 Del sur viene el torbellino, \n" +
                            "Y el frío de los vientos del norte. \n" +
                            "37:10 Por el soplo de Dios se da el hielo, \n" +
                            "Y las anchas aguas se congelan. \n" +
                            "37:11 Regando también llega a disipar la densa nube, \n" +
                            "Y con su luz esparce la niebla. \n" +
                            "37:12 Asimismo por sus designios se revuelven las nubes en derredor, \n" +
                            "Para hacer sobre la faz del mundo, \n" +
                            "En la tierra, lo que él les mande. \n" +
                            "37:13 Unas veces por azote, otras por causa de su tierra, \n" +
                            "Otras por misericordia las hará venir. \n" +
                            "37:14 Escucha esto, Job; \n" +
                            "Detente, y considera las maravillas de Dios. \n" +
                            "37:15 ¿Sabes tú cómo Dios las pone en concierto, \n" +
                            "Y hace resplandecer la luz de su nube? \n" +
                            "37:16 ¿Has conocido tú las diferencias de las nubes, \n" +
                            "Las maravillas del Perfecto en sabiduría? \n" +
                            "37:17 ¿Por qué están calientes tus vestidos \n" +
                            "Cuando él sosiega la tierra con el viento del sur? \n" +
                            "37:18 ¿Extendiste tú con él los cielos, \n" +
                            "Firmes como un espejo fundido? \n" +
                            "37:19 Muéstranos qué le hemos de decir; \n" +
                            "Porque nosotros no podemos ordenar las ideas a causa de las tinieblas. \n" +
                            "37:20 ¿Será preciso contarle cuando yo hablare? \n" +
                            "Por más que el hombre razone, quedará como abismado. \n" +
                            "37:21 Mas ahora ya no se puede mirar la luz esplendente en los cielos, \n" +
                            "Luego que pasa el viento y los limpia, \n" +
                            "37:22 Viniendo de la parte del norte la dorada claridad. \n" +
                            "En Dios hay una majestad terrible. \n" +
                            "37:23 El es Todopoderoso, al cual no alcanzamos, grande en poder; \n" +
                            "Y en juicio y en multitud de justicia no afligirá. \n" +
                            "37:24 Lo temerán por tanto los hombres; \n" +
                            "El no estima a ninguno que cree en su propio corazón ser sabio.\n" +
                            "\n" +
                            "   ";
            }



            if (c==38){

                    cap = "Jehová convence a Job de su ignorancia \n" +
                            "\n" +
                            "38:1 Entonces respondió Jehová a Job desde un torbellino, y dijo: \n" +
                            "38:2 ¿Quién es ése que oscurece el consejo \n" +
                            "Con palabras sin sabiduría? \n" +
                            "38:3 Ahora ciñe como varón tus lomos; \n" +
                            "Yo te preguntaré, y tú me contestarás. \n" +
                            "38:4 ¿Dónde estabas tú cuando yo fundaba la tierra? \n" +
                            "Házmelo saber, si tienes inteligencia. \n" +
                            "38:5 ¿Quién ordenó sus medidas, si lo sabes? \n" +
                            "¿O quién extendió sobre ella cordel? \n" +
                            "38:6 ¿Sobre qué están fundadas sus bases? \n" +
                            "¿O quién puso su piedra angular, \n" +
                            "38:7 Cuando alababan todas las estrellas del alba, \n" +
                            "Y se regocijaban todos los hijos de Dios? \n" +
                            "38:8 ¿Quién encerró con puertas el mar, \n" +
                            "Cuando se derramaba saliéndose de su seno, \n" +
                            "38:9 Cuando puse yo nubes por vestidura suya, \n" +
                            "Y por su faja oscuridad, \n" +
                            "38:10 Y establecí sobre él mi decreto, \n" +
                            "Le puse puertas y cerrojo, \n" +
                            "38:11 Y dije: Hasta aquí llegarás, y no pasarás adelante, \n" +
                            "Y ahí parará el orgullo de tus olas? \n" +
                            "38:12 ¿Has mandado tú a la mañana en tus días? \n" +
                            "¿Has mostrado al alba su lugar, \n" +
                            "38:13 Para que ocupe los fines de la tierra, \n" +
                            "Y para que sean sacudidos de ella los impíos? \n" +
                            "38:14 Ella muda luego de aspecto como barro bajo el sello, \n" +
                            "Y viene a estar como con vestidura; \n" +
                            "38:15 Mas la luz de los impíos es quitada de ellos, \n" +
                            "Y el brazo enaltecido es quebrantado. \n" +
                            "38:16 ¿Has entrado tú hasta las fuentes del mar, \n" +
                            "Y has andado escudriñando el abismo? \n" +
                            "38:17 ¿Te han sido descubiertas las puertas de la muerte, \n" +
                            "Y has visto las puertas de la sombra de muerte? \n" +
                            "38:18 ¿Has considerado tú hasta las anchuras de la tierra? \n" +
                            "Declara si sabes todo esto. \n" +
                            "38:19 ¿Por dónde va el camino a la habitación de la luz, \n" +
                            "Y dónde está el lugar de las tinieblas, \n" +
                            "38:20 Para que las lleves a sus límites, \n" +
                            "Y entiendas las sendas de su casa? \n" +
                            "38:21 ¡Tú lo sabes! Pues entonces ya habías nacido, \n" +
                            "Y es grande el número de tus días. \n" +
                            "38:22 ¿Has entrado tú en los tesoros de la nieve, \n" +
                            "O has visto los tesoros del granizo, \n" +
                            "38:23 Que tengo reservados para el tiempo de angustia, \n" +
                            "Para el día de la guerra y de la batalla? \n" +
                            "38:24 ¿Por qué camino se reparte la luz, \n" +
                            "Y se esparce el viento solano sobre la tierra? \n" +
                            "38:25 ¿Quién repartió conducto al turbión, \n" +
                            "Y camino a los relámpagos y truenos, \n" +
                            "38:26 Haciendo llover sobre la tierra deshabitada, \n" +
                            "Sobre el desierto, donde no hay hombre, \n" +
                            "38:27 Para saciar la tierra desierta e inculta, \n" +
                            "Y para hacer brotar la tierna hierba? \n" +
                            "38:28 ¿Tiene la lluvia padre? \n" +
                            "¿O quién engendró las gotas del rocío? \n" +
                            "38:29 ¿De qué vientre salió el hielo? \n" +
                            "Y la escarcha del cielo, ¿quién la engendró? \n" +
                            "38:30 Las aguas se endurecen a manera de piedra, \n" +
                            "Y se congela la faz del abismo. \n" +
                            "38:31 ¿Podrás tú atar los lazos de las Pléyades, \n" +
                            "O desatarás las ligaduras de Orión? \n" +
                            "38:32 ¿Sacarás tú a su tiempo las constelaciones de los cielos, \n" +
                            "O guiarás a la Osa Mayor con sus hijos? \n" +
                            "38:33 ¿Supiste tú las ordenanzas de los cielos? \n" +
                            "¿Dispondrás tú de su potestad en la tierra? \n" +
                            "38:34 ¿Alzarás tú a las nubes tu voz, \n" +
                            "Para que te cubra muchedumbre de aguas? \n" +
                            "38:35 ¿Enviarás tú los relámpagos, para que ellos vayan? \n" +
                            "¿Y te dirán ellos: Henos aquí? \n" +
                            "38:36 ¿Quién puso la sabiduría en el corazón? \n" +
                            "¿O quién dio al espíritu inteligencia? \n" +
                            "38:37 ¿Quién puso por cuenta los cielos con sabiduría? \n" +
                            "Y los odres de los cielos, ¿quién los hace inclinar, \n" +
                            "38:38 Cuando el polvo se ha convertido en dureza, \n" +
                            "Y los terrones se han pegado unos con otros? \n" +
                            "38:39 ¿Cazarás tú la presa para el león? \n" +
                            "¿Saciarás el hambre de los leoncillos, \n" +
                            "38:40 Cuando están echados en las cuevas, \n" +
                            "O se están en sus guaridas para acechar? \n" +
                            "38:41 ¿Quién prepara al cuervo su alimento, \n" +
                            "Cuando sus polluelos claman a Dios, \n" +
                            "Y andan errantes por falta de comida? ";
            }

            if (c==39){

                    cap = "39:1 ¿Sabes tú el tiempo en que paren las cabras monteses? \n" +
                            "¿O miraste tú las ciervas cuando están pariendo? \n" +
                            "39:2 ¿Contaste tú los meses de su preñez, \n" +
                            "Y sabes el tiempo cuando han de parir? \n" +
                            "39:3 Se encorvan, hacen salir sus hijos, \n" +
                            "Pasan sus dolores. \n" +
                            "39:4 Sus hijos se fortalecen, crecen con el pasto; \n" +
                            "Salen, y no vuelven a ellas. \n" +
                            "39:5 ¿Quién echó libre al asno montés, \n" +
                            "Y quién soltó sus ataduras? \n" +
                            "39:6 Al cual yo puse casa en la soledad, \n" +
                            "Y sus moradas en lugares estériles. \n" +
                            "39:7 Se burla de la multitud de la ciudad; \n" +
                            "No oye las voces del arriero. \n" +
                            "39:8 Lo oculto de los montes es su pasto, \n" +
                            "Y anda buscando toda cosa verde. \n" +
                            "39:9 ¿Querrá el búfalo servirte a ti, \n" +
                            "O quedar en tu pesebre? \n" +
                            "39:10 ¿Atarás tú al búfalo con coyunda para el surco? \n" +
                            "¿Labrará los valles en pos de ti? \n" +
                            "39:11 ¿Confiarás tú en él, por ser grande su fuerza, \n" +
                            "Y le fiarás tu labor? \n" +
                            "39:12 ¿Fiarás de él para que recoja tu semilla, \n" +
                            "Y la junte en tu era? \n" +
                            "39:13 ¿Diste tú hermosas alas al pavo real, \n" +
                            "o alas y plumas al avestruz? \n" +
                            "39:14 El cual desampara en la tierra sus huevos, \n" +
                            "Y sobre el polvo los calienta, \n" +
                            "39:15 Y olvida que el pie los puede pisar, \n" +
                            "Y que puede quebrarlos la bestia del campo. \n" +
                            "39:16 Se endurece para con sus hijos, como si no fuesen suyos, \n" +
                            "No temiendo que su trabajo haya sido en vano; \n" +
                            "39:17 Porque le privó Dios de sabiduría, \n" +
                            "Y no le dio inteligencia. \n" +
                            "39:18 Luego que se levanta en alto, \n" +
                            "Se burla del caballo y de su jinete. \n" +
                            "39:19 ¿Diste tú al caballo la fuerza? \n" +
                            "¿Vestiste tú su cuello de crines ondulantes? \n" +
                            "39:20 ¿Le intimidarás tú como a langosta? \n" +
                            "El resoplido de su nariz es formidable. \n" +
                            "39:21 Escarba la tierra, se alegra en su fuerza, \n" +
                            "Sale al encuentro de las armas; \n" +
                            "39:22 Hace burla del espanto, y no teme, \n" +
                            "Ni vuelve el rostro delante de la espada. \n" +
                            "39:23 Contra él suenan la aljaba, \n" +
                            "El hierro de la lanza y de la jabalina; \n" +
                            "39:24 Y él con ímpetu y furor escarba la tierra, \n" +
                            "Sin importarle el sonido de la trompeta; \n" +
                            "39:25 Antes como que dice entre los clarines: ¡Ea! \n" +
                            "Y desde lejos huele la batalla, \n" +
                            "El grito de los capitanes, y el vocerío. \n" +
                            "39:26 ¿Vuela el gavilán por tu sabiduría, \n" +
                            "Y extiende hacia el sur sus alas? \n" +
                            "39:27 ¿Se remonta el águila por tu mandamiento, \n" +
                            "Y pone en alto su nido? \n" +
                            "39:28 Ella habita y mora en la peña, \n" +
                            "En la cumbre del peñasco y de la roca. \n" +
                            "39:29 Desde allí acecha la presa; \n" +
                            "Sus ojos observan de muy lejos. \n" +
                            "39:30 Sus polluelos chupan la sangre; \n" +
                            "Y donde hubiere cadáveres, allí está ella.\n" +
                            "\n" +
                            "  \n ";
            }

            if (c==40){

                    cap = "40:1 Además respondió Jehová a Job, y dijo: \n" +
                            "40:2 ¿Es sabiduría contender con el Omnipotente? \n" +
                            "El que disputa con Dios, responda a esto. \n" +
                            "40:3 Entonces respondió Job a Jehová, y dijo: \n" +
                            "40:4 He aquí que yo soy vil; ¿qué te responderé? \n" +
                            "Mi mano pongo sobre mi boca. \n" +
                            "40:5 Una vez hablé, mas no responderé; Aun dos veces, mas no volveré a hablar. \n" +
                            "\n" +
                            "Manifestaciones del poder de Dios \n" +
                            "40:6 Respondió Jehová a Job desde el torbellino, y dijo: \n" +
                            "40:7 Cíñete ahora como varón tus lomos; \n" +
                            "Yo te preguntaré, y tú me responderás. \n" +
                            "40:8 ¿Invalidarás tú también mi juicio? \n" +
                            "¿Me condenarás a mí, para justificarte tú? \n" +
                            "40:9 ¿Tienes tú un brazo como el de Dios? \n" +
                            "¿Y truenas con voz como la suya? \n" +
                            "40:10 Adórnate ahora de majestad y de alteza, \n" +
                            "Y vístete de honra y de hermosura. \n" +
                            "40:11 Derrama el ardor de tu ira; \n" +
                            "Mira a todo altivo, y abátelo. \n" +
                            "40:12 Mira a todo soberbio, y humíllalo, \n" +
                            "Y quebranta a los impíos en su sitio. \n" +
                            "40:13 Encúbrelos a todos en el polvo, \n" +
                            "Encierra sus rostros en la oscuridad; \n" +
                            "40:14 Y yo también te confesaré \n" +
                            "Que podrá salvarte tu diestra. \n" +
                            "40:15 He aquí ahora behemot, el cual hice como a ti; \n" +
                            "Hierba come como buey. \n" +
                            "40:16 He aquí ahora que su fuerza está en sus lomos, \n" +
                            "Y su vigor en los músculos de su vientre. \n" +
                            "40:17 Su cola mueve como un cedro, \n" +
                            "Y los nervios de sus muslos están entretejidos. \n" +
                            "40:18 Sus huesos son fuertes como bronce, \n" +
                            "Y sus miembros como barras de hierro. \n" +
                            "40:19 El es el principio de los caminos de Dios; \n" +
                            "El que lo hizo, puede hacer que su espada a él se acerque. \n" +
                            "40:20 Ciertamente los montes producen hierba para él; \n" +
                            "Y toda bestia del campo retoza allá. \n" +
                            "40:21 Se echará debajo de las sombras, \n" +
                            "En lo oculto de las cañas y de los lugares húmedos. \n" +
                            "40:22 Los árboles sombríos lo cubren con su sombra; \n" +
                            "Los sauces del arroyo lo rodean. \n" +
                            "40:23 He aquí, sale de madre el río, pero él no se inmuta; \n" +
                            "Tranquilo está, aunque todo un Jordán se estrelle contra su boca. \n" +
                            "40:24 ¿Lo tomará alguno cuando está vigilante, \n" +
                            "Y horadará su nariz? ";
            }

            if (c==41){

                    cap = "\n" +
                            "41:1 ¿Sacarás tú al leviatán con anzuelo, \n" +
                            "O con cuerda que le eches en su lengua? \n" +
                            "41:2 ¿Pondrás tú soga en sus narices, \n" +
                            "Y horadarás con garfio su quijada? \n" +
                            "41:3 ¿Multiplicará él ruegos para contigo? \n" +
                            "¿Te hablará él lisonjas? \n" +
                            "41:4 ¿Hará pacto contigo \n" +
                            "Para que lo tomes por siervo perpetuo? \n" +
                            "41:5 ¿Jugarás con él como con pájaro, \n" +
                            "O lo atarás para tus niñas? \n" +
                            "41:6 ¿Harán de él banquete los compañeros? \n" +
                            "¿Lo repartirán entre los mercaderes? \n" +
                            "41:7 ¿Cortarás tú con cuchillo su piel, \n" +
                            "O con arpón de pescadores su cabeza? \n" +
                            "41:8 Pon tu mano sobre él; \n" +
                            "Te acordarás de la batalla, y nunca más volverás. \n" +
                            "41:9 He aquí que la esperanza acerca de él será burlada, \n" +
                            "Porque aun a su sola vista se desmayarán. \n" +
                            "41:10 Nadie hay tan osado que lo despierte; \n" +
                            "¿Quién, pues, podrá estar delante de mí? \n" +
                            "41:11 ¿Quién me ha dado a mí primero, para que yo restituya? \n" +
                            "Todo lo que hay debajo del cielo es mío. \n" +
                            "41:12 No guardaré silencio sobre sus miembros, \n" +
                            "Ni sobre sus fuerzas y la gracia de su disposición. \n" +
                            "41:13 ¿Quién descubrirá la delantera de su vestidura? \n" +
                            "¿Quién se acercará a él con su freno doble? \n" +
                            "41:14 ¿Quién abrirá las puertas de su rostro? \n" +
                            "Las hileras de sus dientes espantan. \n" +
                            "41:15 La gloria de su vestido son escudos fuertes, \n" +
                            "Cerrados entre sí estrechamente. \n" +
                            "41:16 El uno se junta con el otro, \n" +
                            "Que viento no entra entre ellos. \n" +
                            "41:17 Pegado está el uno con el otro; \n" +
                            "Están trabados entre sí, que no se pueden apartar. \n" +
                            "41:18 Con sus estornudos enciende lumbre, \n" +
                            "Y sus ojos son como los párpados del alba. \n" +
                            "41:19 De su boca salen hachones de fuego; \n" +
                            "Centellas de fuego proceden. \n" +
                            "41:20 De sus narices sale humo, \n" +
                            "Como de una olla o caldero que hierve. \n" +
                            "41:21 Su aliento enciende los carbones, \n" +
                            "Y de su boca sale llama. \n" +
                            "41:22 En su cerviz está la fuerza, \n" +
                            "Y delante de él se esparce el desaliento. \n" +
                            "41:23 Las partes más flojas de su carne están endurecidas; \n" +
                            "Están en él firmes, y no se mueven. \n" +
                            "41:24 Su corazón es firme como una piedra, \n" +
                            "Y fuerte como la muela de abajo. \n" +
                            "41:25 De su grandeza tienen temor los fuertes, \n" +
                            "Y a causa de su desfallecimiento hacen por purificarse. \n" +
                            "41:26 Cuando alguno lo alcanzare, \n" +
                            "Ni espada, ni lanza, ni dardo, ni coselete durará. \n" +
                            "41:27 Estima como paja el hierro, \n" +
                            "Y el bronce como leño podrido. \n" +
                            "41:28 Saeta no le hace huir; \n" +
                            "Las piedras de honda le son como paja. \n" +
                            "41:29 Tiene toda arma por hojarasca, \n" +
                            "Y del blandir de la jabalina se burla. \n" +
                            "41:30 Por debajo tiene agudas conchas; \n" +
                            "Imprime su agudez en el suelo. \n" +
                            "41:31 Hace hervir como una olla el mar profundo, \n" +
                            "Y lo vuelve como una olla de ungüento. \n" +
                            "41:32 En pos de sí hace resplandecer la senda, \n" +
                            "Que parece que el abismo es cano. \n" +
                            "41:33 No hay sobre la tierra quien se le parezca; \n" +
                            "Animal hecho exento de temor. \n" +
                            "41:34 Menosprecia toda cosa alta; \n" +
                            "Es rey sobre todos los soberbios. ";
            }

            if (c==42){

                    cap = "Confesión y justificación de Job \n" +
                            "\n" +
                            "42:1 Respondió Job a Jehová, y dijo: \n" +
                            "42:2 Yo conozco que todo lo puedes, \n" +
                            "Y que no hay pensamiento que se esconda de ti. \n" +
                            "42:3 ¿Quién es el que oscurece el consejo sin entendimiento? \n" +
                            "Por tanto, yo hablaba lo que no entendía; \n" +
                            "Cosas demasiado maravillosas para mí, que yo no comprendía. \n" +
                            "42:4 Oye, te ruego, y hablaré; \n" +
                            "Te preguntaré, y tú me enseñarás. \n" +
                            "42:5 De oídas te había oído; \n" +
                            "Mas ahora mis ojos te ven. \n" +
                            "42:6 Por tanto me aborrezco, \n" +
                            "Y me arrepiento en polvo y ceniza. \n" +
                            "42:7 Y aconteció que después que habló Jehová estas palabras a Job, Jehová dijo a Elifaz temanita: Mi ira se encendió contra ti y tus dos compañeros; porque no habéis hablado de mí lo recto, como mi siervo Job. \n" +
                            "42:8 Ahora, pues, tomaos siete becerros y siete carneros, e id a mi siervo Job, y ofreced holocausto por vosotros, y mi siervo Job orará por vosotros; porque de cierto a él atenderé para no trataros afrentosamente, por cuanto no habéis hablado de mí con rectitud, como mi siervo Job. \n" +
                            "42:9 Fueron, pues, Elifaz temanita, Bildad suhita y Zofar naamatita, e hicieron como Jehová les dijo; y Jehová aceptó la oración de Job. Restauración de la prosperidad de Job \n" +
                            "42:10 Y quitó Jehová la aflicción de Job, cuando él hubo orado por sus amigos; y aumentó al doble todas las cosas que habían sido de Job. \n" +
                            "42:11 Y vinieron a él todos sus hermanos y todas sus hermanas, y todos los que antes le habían conocido, y comieron con él pan en su casa, y se condolieron de él, y le consolaron de todo aquel mal que Jehová había traído sobre él; y cada uno de ellos le dio una pieza de dinero y un anillo de oro. \n" +
                            "42:12 Y bendijo Jehová el postrer estado de Job más que el primero; porque tuvo catorce mil ovejas, seis mil camellos, mil yuntas de bueyes y mil asnas, \n" +
                            "42:13 y tuvo siete hijos y tres hijas. \n" +
                            "42:14 Llamó el nombre de la primera, Jemima, el de la segunda, Cesia, y el de la tercera, Keren-hapuc. \n" +
                            "42:15 Y no había mujeres tan hermosas como las hijas de Job en toda la tierra; y les dio su padre herencia entre sus hermanos. \n" +
                            "42:16 Después de esto vivió Job ciento cuarenta años, y vio a sus hijos, y a los hijos de sus hijos, hasta la cuarta generación. \n" +
                            "42:17 Y murió Job viejo y lleno de días.\n" +
                            "\n ";
            }
        return cap;


    }

}
