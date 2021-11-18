/**
 * <h1> Proyecto Integrador -  sistema de contratacion 
 * <h2> Programacion Orientada a Objetos seccion 41</h1>
 * <h3> Sistema (Forma parte del Modelo) </h2>
 * 
 * 
 * Descripcion: Relaciona las clases de TestPsico, TestLider y Controlador. 
 * Se encarga de seleccionar las preguntas de manera aleatoria de los test de 
 * Lider y Psicologia; ademas, este contara con las respuestas a las preguntas 
 * que posteriormente se enviaran a la clase a ModificadorCSV. Mayormente contara
 * con ArrayList.
 * 
 * 
 * @author Grupo 4 
 * @since3 20-octubre-2021
 * @version 1.0
 * @category Modelo 
 */

public class Test{
    private String[] ListaLid = { //Listado de preguntas que para el test lider que es el que evalua las capacidades de los aspirantes 
        "\n------------------------------------------------------------------------------------\n¿Por que es importante alinear las decisiones de produccion con los objetivos del negocio?\n\nA) Establecer objetivos de rendimiento eficaces \nB) Definir la etica de la organizacion \nC) Apoyar el empoderamiento del personal \nD) Establecer la participacion de las partes interesadas\n\n", // A
        "\n------------------------------------------------------------------------------------\nEs necesario planear el trabajo para un proyecto importante. ¿Como deberia contribuir el gerente a esta planeacion?\n\nA)Aseguran que las partes interesadas relevantes esten involucradas \nB) Evaluan el exito del proyecto \nC) Se asegura de que los tiempos estipulados se cumplan \nD) Monitorean el rendimiento del personal\n\n", //A
        "\n------------------------------------------------------------------------------------\n¿Cual de estas caracteristicas es propia de un sistema de manejo de desempeño?\n\nA) Confirma las responsabilidades del personal \nB) Da forma a la estrategia de negocio \nC) Se centra en los resultados del trabajo \nD) Define objetivos que ayudan a la organizacion de trabajo", //C
        "\n------------------------------------------------------------------------------------\nUna organizacion de manufacturacion tiene el objetivo de duplicar sus ventas a lo largo del siguiente año. ¿Que deberia hacer el gerente de manufacturacion para alcanzar el objetivo?\n\nA) Planificar nuevos objetivos de produccion \nB) Desarrollar nuevas habilidades para el equipo de trabajo \nC) Actualizar y mejorar la tecnologia disponible \nD) Informar a los clientes existentes\n\n", // A
        "\n------------------------------------------------------------------------------------\n¿Cual de las siguientes diferencia mejor como es que un lider y un gerente afectan a un equipo?\n\nA) Reaccionando al cambio \nB) Siendo un ejemplo para el equipo  \nC) Ejerciendo la autoridad formal \nD) Dedicandose solo al control\n\n", //B
        "\n------------------------------------------------------------------------------------\n¿Cuales de los siguientes participa en el establecimiento de indicadores clave de rendimiento?\n\nA) Concentrarse en todas las actividades comerciales \nB) Relacionando solo con aspectos controlables del negocio \nC) Establecer un punto de referencia para revisar las actividades de la competencia \nD) Poner enfasis en el logro de la mision de la organizacion \nE) Centrarse principalmente en los resultados de los empleados\n\n", //B
        "\n------------------------------------------------------------------------------------\nUn gerente quiere introducir adiciones a la gama actual de productos. ¿Por que es importante que el gerente evalue el impacto potencial de esta decision? Seleccione una opcion.\n\nA) Revisar los indices de referencia actuales \nB) Evaluar la influencia de las partes interesadas \nC) Medir los efectos negativos sobre la motivacion \nD) Evaluar el riesgo de reacciones deficientes de los clientes\n\n", //D
        "\n------------------------------------------------------------------------------------\nUna organizacion pequeña, que opera en un mercado donde la creatividad y la innovacion son importantes, tiene un lider con un estilo de liderazgo democratico. ¿Que impacto tendra este estilo de liderazgo en los empleados? Seleccione una opcion.\n\nA) El personal cumple con los procedimientos establecidos \nB) El personal es supervisado de cerca \nC) El personal recibira prestaciones adicionales \nD) La moral del personal sera mas alta\n\n", //D
        "\n------------------------------------------------------------------------------------\nUn gerente ha decidido introducir cambios en los procedimientos de trabajo. ¿Que principio importante debe considerar el gerente antes de hacer esto? Seleccione una opcion.\n\nA) Que las decisiones estan alineadas con las politicas empresariales \nB) Que las decisiones reflejan las actividades de la competencia \nC) Que las decisiones estan respaldadas por la etica del personal \nD) Que las decisiones reflejan las normas de la industria\n\n", //A
        "\n------------------------------------------------------------------------------------\nUna organizacion adquiere un sistema de informacion de gestion para apoyar la gestion del rendimiento. ¿Como se beneficia la organizacion de usar esto? Seleccione una opcion.\n\nA) Se identifican hitos \nB) Los objetivos estan alineados con la vision de negocio \nC) Comparacion con las mejores practicas externas es posible \nD) Los datos sin procesar se convierten en un formato accesible\n\n", //D
        "\n------------------------------------------------------------------------------------\nUn gerente requiere que el sistema de medicion del desempeño de su organizacion proporcione informacion regular, precisa y consistente. ¿Cual de estas caracteristicas es esencial para cumplir estos criterios? Seleccione una opcion.\n\nA) Facilidad de uso \nB) Flexibilidad \nC) Rentabilidad \nD) Fiabilidad\n\n", // D
        "\n------------------------------------------------------------------------------------\n¿Como debe tratar una empresa con el personal de oficina que carece de las habilidades y competencias adecuadas? Seleccione una opcion.\n\nA) Ofrecer capacitacion sobre el funcionamiento de maquinas de produccion \nB) Proporcionar capacitacion en habilidades administrativas \nC) Introducir patrones de trabajo mas flexibles \nD) Realizar evaluaciones de los empleados\n\n", //B
        "\n------------------------------------------------------------------------------------\nSe le ha pedido a un gerente que explique la diferencia entre los productos y los resultados en un manual para nuevos empleados. ¿Como debe explicar el gerente la diferencia? Seleccione una opcion.\n\nA) Los productos estan vinculados a las instalaciones disponibles y los resultados son tangibles \nB) Los productos estan vinculados a los objetivos y los resultados son observables \nC) Los productos son medibles y los resultados estan vinculados al servicio ofrecido \nD) Los productos son los cambios que deben lograrse y los resultados son los productos\n\n", // B
        "\n------------------------------------------------------------------------------------\nPara garantizar que su organizacion alcance sus objetivos, un gerente tiene la responsabilidad de controlar la implementacion de nuevos procedimientos de trabajo. ¿Que debe hacer el gerente para garantizar esto? Seleccione una opcion.\n\nA) Evaluar la participacion de las partes interesadas \nB) Identificar amenazas externas \nC) Analizar la actividad de la competencia \nD) Establecer puntos de referencia de rendimiento\n\n", // D
        "\n------------------------------------------------------------------------------------\n¿Cual de estas opciones diferencia mejor el como un gerente en lugar de un lider influye en los equipos? Seleccione una opcion.\n\nA) Direccion segun las preferencias del equipo \nB) Proporcionar una vision para el futuro \nC) Control a traves de la estructura y los sistemas \nD) Fomentar la innovacion y la resolucion de problemas\n\n", // C
        "\n------------------------------------------------------------------------------------\nUna organizacion ha experimentado un aumento de clientes que devuelven productos defectuosos. ¿Como debe la organizacion resolver este problema? Seleccione una opcion.\n\nA) Reducir los limites de reembolso \nB) Aumentar los controles de calidad \nC) Mejorar el entorno de trabajo \nD) Eliminar los incentivos de produccion\n\n", // B
        "\n------------------------------------------------------------------------------------\nUna empresa manufacturera ha reducido su presupuesto de compras debido a la disminucion de las ventas. ¿Como afectara esto al equipo de produccion? Seleccione una opcion.\n\nA) Reglas mas rigidas en el lugar de trabajo \nB) Mayor supervision de los empleados \nC) Menor acceso a las materias primas \nD) Menos ausencias del personal\n\n", // C
        "\n------------------------------------------------------------------------------------\n¿Como se utilizarian los paneles de rendimiento para informar sobre el progreso del negocio?\n\nA) Mediante la produccion de pantallas graficas \nB) Mediante la revision de los factores de exito \nC) Mediante la utilizacion del sistema de semaforos \nD) Mediante la evaluacion de los logros individuales \nE) Mediante la evaluacion de las aplicaciones de software\n\n", // A
        "\n------------------------------------------------------------------------------------\nUn gerente esta coordinando un proyecto con equipos de toda la organizacion. ¿Cual es una responsabilidad importante para este gerente? Seleccione una opcion.\n\nA) Revision de tendencias \nB) Realizacion de un analisis ambiental \nC) Establecimiento de lineas de comunicacion \nD) Establecimiento de objetivos\n\n", // C
        "\n------------------------------------------------------------------------------------\nMiembros de un equipo de ventas han establecido nuevos objetivos de ventas individuales. ¿Que debe hacer el gerente para garantizar que estos objetivos se logren? Seleccione dos opciones.\n\nA) Introducir eventos sociales semanales \nB) Proporcionar recursos apropiados \nC) Iniciar revisiones de desempeño \nD) Revisar las politicas de la empresa \nE) Destacar las fortalezas personales\n\n", // B
    }; 

    private String[] ListaLidRespuestas = { //Estas son las respuestas para cada pregunta 
        "A",  //Pregunta 1
        "A",  //Pregunta 2
        "C",  //Pregunta 3
        "A",  //Pregunta 4
        "B",  //Pregunta 5
        "B",  //Pregunta 6
        "D",  //Pregunta 7
        "D",  //Pregunta 8
        "A",  //Pregunta 9
        "D",  //Pregunta 10
        "D",  //Pregunta 11
        "B",  //Pregunta 12
        "B",  //Pregunta 13
        "D",  //Pregunta 14
        "C",  //Pregunta 15
        "B",  //Pregunta 16
        "C",  //Pregunta 17
        "A",  //Pregunta 18
        "C",  //Pregunta 19
        "B",  //Pregunta 20
    };


    
    private String[] ListaPsico = {
        "\n------------------------------------------------------------------------------------\nPoseo la energia suficiente para enfrentarme a todos mis problemas\n\nA) Siempre\nB) Frecuentemente\nC) Raras veces\n\n", //A
        "\n------------------------------------------------------------------------------------\nEvito criticar a la gente y sus ideas. \n\nA) Si\nB) Algunas veces\nC) No\n\n", //B
        "\n------------------------------------------------------------------------------------\nHe pertenecido a algun equipo deportivo o similar. \n\nA) Si \nB) No \n\n", //A
        "\n------------------------------------------------------------------------------------\nCuando me propongo una meta ¿Me aseguro de cumplirlas?. \n\nA) Si \nB) No \n\n", //A
        "\n------------------------------------------------------------------------------------\nEs mejor ser cauto y esperar poco que optimista y esperar siempre el exito. \n\nA) Afirmativo\nB) Falso \n\n", //A
        "\n------------------------------------------------------------------------------------\nCuando se complica el trabajo. \n\nA) Busco soluciones lo antes posible. \nB) Intento organizar todo para evitar que aparezcan.\nC) Me estreso y busco que otra persona lo solucione. \n\n", //A
        "\n------------------------------------------------------------------------------------\nLos trabajos o tareas prefiero. \n\nA) Trabajarlas en grupo. \nB) Trabajar solo\nC) Trabajar partes solo y en grupo. \n\n", //C
        "\n------------------------------------------------------------------------------------\nPrefiero planear las cosas y no tener prisas o imprevistos. \n\nA) Afirmativo\nB) Falso \n\n", //A
        "\n------------------------------------------------------------------------------------\nMe considero una persona entusiasta. \n\nA) Falso\nB) Verdadero\n\n", //B
        "\n------------------------------------------------------------------------------------\n¿Me resulta embarazoso que me dediquen elogios o cumplidos? \n\nA) Si \nB) Termino medio \nC) No \n\n", // C
        "\n------------------------------------------------------------------------------------\n¿Me gusta tomar parte activa en las tareas sociales, trabajos de comite, etc? \n\nA) Si \nB) Termino medio \nC) No \n\n", // A
        "\n------------------------------------------------------------------------------------\nAl llevar a cabo una tarea, no estoy satisfecho hasta que se ha considerado con toda atencion el menor detalle:  \n\nA) Si \nB) A veces \nC) No \n\n", // A
        "\n------------------------------------------------------------------------------------\nSiempre soy capaz de controlar perfectamente la expresion de mis sentimientos:  \n\nA) Si \nB) A veces\nC) No \n\n", // A
        "\n------------------------------------------------------------------------------------\nAlgunas personas parecen ignorarme o evitarme, aunque no se por que:  \n\nA) Verdadero \nB) No estoy seguro \nC) Falso \n\n", // C
        "\n------------------------------------------------------------------------------------\nAunque no sea en un grupo mixto de mujeres y hombres, me disgusta que se use un lenguaje obsceno.  \n\nA) Verdadero \nB) No estoy seguro \nC) Falso \n\n", // A
        "\n------------------------------------------------------------------------------------\nMe resulta facil mezclarme con la gente en una reunion social:  \n\nA) Verdadero \nB) No estoy seguro \nC) Falso \n\n", // A
        "\n------------------------------------------------------------------------------------\nSeria mas interesante ser:  \n\nA) Orientador vocacional  \nB) No estoy seguro \nC) Directivo \n\n", // C
        "\n------------------------------------------------------------------------------------\nMe disgusta el modo con que algunas personas se fijan en otras en la calle o en las tiendas:  \n\nA) Si  \nB) No estoy seguro \nC) No \n\n", // A
        "\n------------------------------------------------------------------------------------\nMe niego a admitir sugerencias bien intencionadas de los demas. aunque se que no deberia hacerlo:   \n\nA) Algunas veces  \nB) Casi nunca \nC) Nunca \n\n", // C
        "\n------------------------------------------------------------------------------------\nMe considero a mi mismo como una persona muy abierta y sociable:  \n\nA) Si  \nB) Termino medio \nC) No \n\n", // A
    };
    
    private String[] ListaPsicoRespuestas = {
        "A", //Pregunta 1 
        "B", //Pregunta 2
        "A", //Pregunta 3
        "A", //Pregunta 4
        "A", //Pregunta 5
        "A", //Pregunta 6
        "C", //Pregunta 7
        "A", //Pregunta 8
        "B", //Pregunta 9
        "C", //Pregunta 10
        "A", //Pregunta 11
        "A", //Pregunta 12
        "A", //Pregunta 13
        "C", //Pregunta 14
        "A", //Pregunta 15
        "A", //Pregunta 16
        "C", //Pregunta 17
        "A", //Pregunta 18
        "C", //Pregunta 19
        "A", //Pregunta 20

    };


    //Metodos getters____________________________________________________
    //Getter para obtener la lista de preguntas 
    public String[] getListaLid(){
        return ListaLid;
    }
    
    //Getter para obtener la lista de respuestas
    public String[] getListaLidRespuestas(){
        return ListaLidRespuestas;
    }

    //--->Getters
    public String[] getListaPsico() {
        return ListaPsico;
    }

    public String[] getListaPsicoRespuestas() {
        return ListaPsicoRespuestas;
    }
}