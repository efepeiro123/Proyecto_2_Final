/**
 * <h1> Proyecto Integrador -  sistema de contratación 
 * <h2> Programación Orientada a Objetos sección 41</h1>
 * <h3> Sistema (Forma parte del Modelo) </h2>
 * 
 * 
 * Descripción: Relaciona las clases de TestPsico, TestLider y Controlador. 
 * Se encarga de seleccionar las preguntas de manera aleatoria de los test de 
 * Líder y Psicología; además, este contará con las respuestas a las preguntas 
 * que posteriormente se enviarán a la clase a ModificadorCSV. Mayormente contará
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
        "\n------------------------------------------------------------------------------------\n1. ¿Por qué es importante alinear las decisiones de producción con los objetivos del negocio?\n\nA) Establecer objetivos de rendimiento eficaces \nB) Definir la ética de la organización \nC) Apoyar el empoderamiento del personal \nD) Establecer la participación de las partes interesadas\n\n", // A
        "\n------------------------------------------------------------------------------------\n2. Es necesario planear el trabajo para un proyecto importante. ¿Cómo debería contribuir el gerente a esta planeación?\n\nA)Aseguran que las partes interesadas relevantes estén involucradas \nB) Evaluan el exito del proyecto \nC) Se asegura de que los tiempos estipulados se cumplan \nD) Monitorean el rendimiento del personal\n\n", //A
        "\n------------------------------------------------------------------------------------\n3. ¿Cuál de estas características es propia de un sistema de manejo de desempeño?\n\nA) Confirma las responsabilidades del personal \nB) Da forma a la estrategia de negocio \nC) Se centra en los resultados del trabajo \nD) Define objetivos que ayudan a la organización de trabajo", //C
        "\n------------------------------------------------------------------------------------\n4. Una organización de manufacturación tiene el objetivo de duplicar sus ventas a lo largo del siguiente año. ¿Qué debería hacer el gerente de manufacturación para alcanzar el objetivo?\n\nA) Planificar nuevos objetivos de producción \nB) Desarrollar nuevas habilidades para el equipo de trabajo \nC) Actualizar y mejorar la tecnología disponible \nD) Informar a los clientes existentes\n\n", // A
        "\n------------------------------------------------------------------------------------\n5. ¿Cuál de las siguientes diferencia mejor cómo es que un líder y un gerente afectan a un equipo?\n\nA) Reaccionando al cambio \nB) Siendo un ejemplo para el equipo  \nC) Ejerciendo la autoridad formal \nD) Dedicándose solo al control\n\n", //B
        "\n------------------------------------------------------------------------------------\n6. ¿Cuáles de los siguientes participa en el establecimiento de indicadores clave de rendimiento?\n\nA)Concentrarse en todas las actividades comerciales \nB) Relacionando solo con aspectos controlables del negocio \nC) Establecer un punto de referencia para revisar las actividades de la competencia \nD) Poner énfasis en el logro de la misión de la organización \nE) Centrarse principalmente en los resultados de los empleados\n\n", //B
        "\n------------------------------------------------------------------------------------\n7. Un gerente quiere introducir adiciones a la gama actual de productos. ¿Por qué es importante que el gerente evalúe el impacto potencial de esta decisión? Seleccione una opción.\n\nA) Revisar los índices de referencia actuales \nB) Evaluar la influencia de las partes interesadas \nC) Medir los efectos negativos sobre la motivación \nD) Evaluar el riesgo de reacciones deficientes de los clientes\n\n", //D
        "\n------------------------------------------------------------------------------------\n8. Una organización pequeña, que opera en un mercado donde la creatividad y la innovación son importantes, tiene un líder con un estilo de liderazgo democrático. ¿Qué impacto tendrá este estilo de liderazgo en los empleados? Seleccione una opción.\n\nA) El personal cumple con los procedimientos establecidos \nB) El personal es supervisado de cerca \nC) El personal recibirá prestaciones adicionales \nD) La moral del personal será más alta\n\n", //D
        "\n------------------------------------------------------------------------------------\n9. Un gerente ha decidido introducir cambios en los procedimientos de trabajo. ¿Qué principio importante debe considerar el gerente antes de hacer esto? Seleccione una opción.\n\nA) Que las decisiones están alineadas con las políticas empresariales \nB) Que las decisiones reflejan las actividades de la competencia \nC) Que las decisiones están respaldadas por la ética del personal \nD) Que las decisiones reflejan las normas de la industria\n\n", //A
        "\n------------------------------------------------------------------------------------\n10. Una organización adquiere un sistema de información de gestión para apoyar la gestión del rendimiento. ¿Cómo se beneficia la organización de usar esto? Seleccione una opción.\n\nA) Se identifican hitos \nB) Los objetivos están alineados con la visión de negocio \nC) Comparación con las mejores prácticas externas es posible \nD) Los datos sin procesar se convierten en un formato accesible\n\n", //D
        "\n------------------------------------------------------------------------------------\n11. Un gerente requiere que el sistema de medición del desempeño de su organización proporcione información regular, precisa y consistente. ¿Cuál de estas características es esencial para cumplir estos criterios? Seleccione una opción.\n\nA) Facilidad de uso \nB) Flexibilidad \nC) Rentabilidad \nD) Fiabilidad\n\n", // D
        "\n------------------------------------------------------------------------------------\n12. ¿Cómo debe tratar una empresa con el personal de oficina que carece de las habilidades y competencias adecuadas? Seleccione una opción.\n\nA) Ofrecer capacitación sobre el funcionamiento de máquinas de producción \nB) Proporcionar capacitación en habilidades administrativas \nC) Introducir patrones de trabajo más flexibles \nD) Realizar evaluaciones de los empleados\n\n", //B
        "\n------------------------------------------------------------------------------------\n13. Se le ha pedido a un gerente que explique la diferencia entre los productos y los resultados en un manual para nuevos empleados. ¿Cómo debe explicar el gerente la diferencia? Seleccione una opción.\n\nA) Los productos están vinculados a las instalaciones disponibles y los resultados son tangibles \nB) Los productos están vinculados a los objetivos y los resultados son observables \nC) Los productos son medibles y los resultados están vinculados al servicio ofrecido \nD) Los productos son los cambios que deben lograrse y los resultados son los productos\n\n", // B
        "\n------------------------------------------------------------------------------------\n14. Para garantizar que su organización alcance sus objetivos, un gerente tiene la responsabilidad de controlar la implementación de nuevos procedimientos de trabajo. ¿Qué debe hacer el gerente para garantizar esto? Seleccione una opción.\n\nA) Evaluar la participación de las partes interesadas \nB) Identificar amenazas externas \nC) Analizar la actividad de la competencia \nD) Establecer puntos de referencia de rendimiento\n\n", // D
        "\n------------------------------------------------------------------------------------\n15. ¿Cuál de estas opciones diferencia mejor el cómo un gerente en lugar de un líder influye en los equipos? Seleccione una opción.\n\nA) Dirección según las preferencias del equipo \nB) Proporcionar una visión para el futuro \nC) Control a través de la estructura y los sistemas \nD) Fomentar la innovación y la resolución de problemas\n\n", // C
        "\n------------------------------------------------------------------------------------\n16. Una organización ha experimentado un aumento de clientes que devuelven productos defectuosos. ¿Cómo debe la organización resolver este problema? Seleccione una opción.\n\nA) Reducir los límites de reembolso \nB) Aumentar los controles de calidad \nC) Mejorar el entorno de trabajo \nD) Eliminar los incentivos de producción\n\n", // B
        "\n------------------------------------------------------------------------------------\n17. Una empresa manufacturera ha reducido su presupuesto de compras debido a la disminución de las ventas. ¿Cómo afectará esto al equipo de producción? Seleccione una opción.\n\nA) Reglas más rígidas en el lugar de trabajo \nB) Mayor supervisión de los empleados \nC) Menor acceso a las materias primas \nD) Menos ausencias del personal\n\n", // C
        "\n------------------------------------------------------------------------------------\n18. ¿Cómo se utilizarían los paneles de rendimiento para informar sobre el progreso del negocio?\n\nA) Mediante la producción de pantallas gráficas \nB) Mediante la revisión de los factores de éxito \nC) Mediante la utilización del sistema de semáforos \nD) Mediante la evaluación de los logros individuales \nE) Mediante la evaluación de las aplicaciones de software\n\n", // A
        "\n------------------------------------------------------------------------------------\n19. Un gerente está coordinando un proyecto con equipos de toda la organización. ¿Cuál es una responsabilidad importante para este gerente? Seleccione una opción.\n\nA) Revisión de tendencias \nB) Realización de un análisis ambiental \nC) Establecimiento de líneas de comunicación \nD) Establecimiento de objetivos\n\n", // C
        "\n------------------------------------------------------------------------------------\n20. Miembros de un equipo de ventas han establecido nuevos objetivos de ventas individuales. ¿Qué debe hacer el gerente para garantizar que estos objetivos se logren? Seleccione dos opciones.\n\nA) Introducir eventos sociales semanales \nB) Proporcionar recursos apropiados \nC) Iniciar revisiones de desempeño \nD) Revisar las políticas de la empresa \nE) Destacar las fortalezas personales\n\n", // B
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
        "\n------------------------------------------------------------------------------------\n1. Poseo la energía suficiente para enfrentarme a todos mis problemas\n\nA) Siempre\nB) Frecuentemente\n C) Raras veces\n\n", //A
        "\n------------------------------------------------------------------------------------\n2. Evito criticar a la gente y sus ideas. \n\nA) Si\nB) Algunas veces\n C) No\n\n", //B
        "\n------------------------------------------------------------------------------------\n3. He pertenecido a algún equipo deportivo o similar. \n\nA) Si \nB) No \n\n", //A
        "\n------------------------------------------------------------------------------------\n4.Cuando me propongo una meta ¿Me aseguro de cumplirlas?. \n\nA) Si \nB) No \n\n", //A
        "\n------------------------------------------------------------------------------------\n5. Es mejor ser cauto y esperar poco que optimista y esperar siempre el éxito. \n\nA) Afirmativo\nB) Falso \n\n", //A
        "\n------------------------------------------------------------------------------------\n6. Cuando se complica el trabajo. \n\nA) Busco soluciones lo antes posible. \nB) Intentó organizar todo para evitar que aparezcan.\n C) Me estreso y busco que otra persona lo solucione. \n\n", //A
        "\n------------------------------------------------------------------------------------\n7. Los trabajos o tareas prefiero. \n\nA)Trabajarlas en grupo. \nB) Trabajar solo\nC)Trabajar partes solo y en grupo. \n\n", //C
        "\n------------------------------------------------------------------------------------\n8. Prefiero planear las cosas y no tener prisas o imprevistos. \n\nA) Afirmativo\nB) \n\n", //A
        "\n------------------------------------------------------------------------------------\n9. Me considero una persona entusiasta. \n\nA)Falso\nB) Verdadero\n\n", //B
        "\n------------------------------------------------------------------------------------\n10. ¿Me resulta embarazoso que me dediquen elogios o cumplidos? \n\nA) Si \nB) Término medio \nC) No \n\n", // C
        "\n------------------------------------------------------------------------------------\n11. ¿Me gusta tomar parte activa en las tareas sociales, trabajos de comité, etc? \n\nA) Si \nB) Término medio \nC) No \n\n", // A
        "\n------------------------------------------------------------------------------------\n12. Al llevar a cabo una tarea, no estoy satisfecho hasta que se ha considerado con toda atención el menor detalle:  \n\nA) Si \nB) A veces \nC) No \n\n", // A
        "\n------------------------------------------------------------------------------------\n13. Siempre soy capaz de controlar perfectamente la expresión de mis sentimientos:  \n\nA) Si \nB) A veces\nC) No \n\n", // A
        "\n------------------------------------------------------------------------------------\n14. Algunas personas parecen ignorarme o evitarme, aunque no sé por qué:  \n\nA) Verdadero \nB) No estoy seguro nC) Falso \n\n", // C
        "\n------------------------------------------------------------------------------------\n15. Aunque no sea en un grupo mixto de mujeres y hombres, me disgusta que se use un lenguaje obsceno.  \n\nA) Verdadero \nB) No estoy seguro nC) Falso \n\n", // A
        "\n------------------------------------------------------------------------------------\n16. Me resulta fácil mezclarme con la gente en una reunión social:  \n\nA) Verdadero \nB) No estoy seguro nC) Falso \n\n", // A
        "\n------------------------------------------------------------------------------------\n17. Sería más interesante ser:  \n\nA) Orientador vocacional  \nB) No estoy seguro nC) Directivo \n\n", // C
        "\n------------------------------------------------------------------------------------\n18. Me disgusta el modo con que algunas personas se fijan en otras en la calle o en las tiendas:  \n\nA) Si  \nB) No estoy seguro nC) No \n\n", // A
        "\n------------------------------------------------------------------------------------\n19. Me niego a admitir sugerencias bien intencionadas de los demás. aunque sé que no debería hacerlo:   \n\nA) Algunas veces  \nB) Casi nunca \nC) Nunca \n\n", // C
        "\n------------------------------------------------------------------------------------\n.20Me considero a mí mismo como una persona muy abierta y sociable:  \n\nA) Si  \nB) Término medio \nC) No \n\n", // A
    };
    
    private String[] ListaPsicoRespuestas;


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