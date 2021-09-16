public class TestLider{
    //Atributos__________________________________________________________ 
    private String[] ListaLid = {
        "¿Por qué es importante alinear las decisiones de producción con los objetivos del negocio? \nA) Establecer objetivos de rendimiento eficaces \nB) Definir la ética de la organización \nC) Apoyar el empoderamiento del personal \nD) Establecer la participación de las partes interesadas", // 
        "Es necesario planear el trabajo para un proyecto importante. ¿Cómo debería contribuir el gerente a esta planeación?\nA)Aseguran que las partes interesadas relevantes estén involucradas \nB) Evaluan el exito del proyecto \nC) Se asegura de que los tiempos estipulados se cumplan \nD) Monitorean el rendimiento del personal", //
        "¿Cuál de estas características es propia de un sistema de manejo de desempeño?\nA) Confirma las responsabilidades del personal \nB) Da forma a la estrategia de negocio \nC) Se centra en los resultados del trabajo \nD) Define objetivos que ayudan a la organización de trabajo", //
        "Una organización de manufacturación tiene el objetivo de duplicar sus ventas a lo largo del siguiente año. ¿Qué debería hacer el gerente de manufacturación para alcanzar el objetivo?\nA) Planificar nuevos objetivos de producción \nB) Desarrollar nuevas habilidades para el equipo de trabajo \nC) Actualizar y mejorar la tecnología disponible \nD) Informar a los clientes existentes", // 
        "¿Cuál de las siguientes diferencia mejor cómo es que un líder y un gerente afectan a un equipo? \nA) Reaccionando al cambio \nB) Siendo un ejemplo para el equipo  \nC) Ejerciendo la autoridad formal \nD) Dedicándose solo al control", //
        "¿Cuáles de los siguientes participa en el establecimiento de indicadores clave de rendimiento? \nA)Concentrarse en todas las actividades comerciales \nB) Relacionando solo con aspectos controlables del negocio \nC) Establecer un punto de referencia para revisar las actividades de la competencia \nD) Poner énfasis en el logro de la misión de la organización \nE) Centrarse principalmente en los resultados de los empleados", //
        "Un gerente quiere introducir adiciones a la gama actual de productos. ¿Por qué es importante que el gerente evalúe el impacto potencial de esta decisión? Seleccione una opción. \nA) Revisar los índices de referencia actuales \nB) Evaluar la influencia de las partes interesadas \nC) Medir los efectos negativos sobre la motivación \nD) Evaluar el riesgo de reacciones deficientes de los clientes", //
        "Una organización pequeña, que opera en un mercado donde la creatividad y la innovación son importantes, tiene un líder con un estilo de liderazgo democrático. ¿Qué impacto tendrá este estilo de liderazgo en los empleados? Seleccione una opción. \nA) El personal cumple con los procedimientos establecidos \nB) El personal es supervisado de cerca \nC) El personal recibirá prestaciones adicionales \nD) La moral del personal será más alta", //
        "Un gerente ha decidido introducir cambios en los procedimientos de trabajo. ¿Qué principio importante debe considerar el gerente antes de hacer esto? Seleccione una opción. \nA) Que las decisiones están alineadas con las políticas empresariales \nB) Que las decisiones reflejan las actividades de la competencia \nC) Que las decisiones están respaldadas por la ética del personal \nD) Que las decisiones reflejan las normas de la industria", //
        "Una organización adquiere un sistema de información de gestión para apoyar la gestión del rendimiento. ¿Cómo se beneficia la organización de usar esto? Seleccione una opción. \nA) Se identifican hitos \nB) Los objetivos están alineados con la visión de negocio \nC) Comparación con las mejores prácticas externas es posible \nD) Los datos sin procesar se convierten en un formato accesible", //
        "Un gerente requiere que el sistema de medición del desempeño de su organización proporcione información regular, precisa y consistente. ¿Cuál de estas características es esencial para cumplir estos criterios? Seleccione una opción. \nA) Facilidad de uso \nB) Flexibilidad \nC) Rentabilidad \nD) Fiabilidad", // 
        "¿Cómo debe tratar una empresa con el personal de oficina que carece de las habilidades y competencias adecuadas? Seleccione una opción. \nA) Ofrecer capacitación sobre el funcionamiento de máquinas de producción \nB) Proporcionar capacitación en habilidades administrativas \nC) Introducir patrones de trabajo más flexibles \nD) Realizar evaluaciones de los empleados", //
        "Se le ha pedido a un gerente que explique la diferencia entre los productos y los resultados en un manual para nuevos empleados. ¿Cómo debe explicar el gerente la diferencia? Seleccione una opción. \nA) Los productos están vinculados a las instalaciones disponibles y los resultados son tangibles \nB) Los productos están vinculados a los objetivos y los resultados son observables \nC) Los productos son medibles y los resultados están vinculados al servicio ofrecido \nD) Los productos son los cambios que deben lograrse y los resultados son los productos", // 
        "Para garantizar que su organización alcance sus objetivos, un gerente tiene la responsabilidad de controlar la implementación de nuevos procedimientos de trabajo. ¿Qué debe hacer el gerente para garantizar esto? Seleccione una opción. \nA) Evaluar la participación de las partes interesadas \nB) Identificar amenazas externas \nC) Analizar la actividad de la competencia \nD) Establecer puntos de referencia de rendimiento", // 
        "¿Cuál de estas opciones diferencia mejor el cómo un gerente en lugar de un líder influye en los equipos? Seleccione una opción. \nA) Dirección según las preferencias del equipo \nB) Proporcionar una visión para el futuro \nC) Control a través de la estructura y los sistemas \nD) Fomentar la innovación y la resolución de problemas", // 
        "Una organización ha experimentado un aumento de clientes que devuelven productos defectuosos. ¿Cómo debe la organización resolver este problema? Seleccione una opción. \nA) Reducir los límites de reembolso \nB) Aumentar los controles de calidad \nC) Mejorar el entorno de trabajo \nD) Eliminar los incentivos de producción", // 
        "Una empresa manufacturera ha reducido su presupuesto de compras debido a la disminución de las ventas. ¿Cómo afectará esto al equipo de producción? Seleccione una opción. \nA) Reglas más rígidas en el lugar de trabajo \nB) Mayor supervisión de los empleados \nC) Menor acceso a las materias primas \nD) Menos ausencias del personal", // 
        "¿Cómo se utilizarían los paneles de rendimiento para informar sobre el progreso del negocio? Seleccione dos opciones. \nA) Mediante la producción de pantallas gráficas \nB) Mediante la revisión de los factores de éxito \nC) Mediante la utilización del sistema de semáforos \nD) Mediante la evaluación de los logros individuales \nE) Mediante la evaluación de las aplicaciones de software", // 
        "Un gerente está coordinando un proyecto con equipos de toda la organización. ¿Cuál es una responsabilidad importante para este gerente? Seleccione una opción. \nA) Revisión de tendencias \nB) Realización de un análisis ambiental \nC) Establecimiento de líneas de comunicación \nD) Establecimiento de objetivos", // 
        "Miembros de un equipo de ventas han establecido nuevos objetivos de ventas individuales. ¿Qué debe hacer el gerente para garantizar que estos objetivos se logren? Seleccione dos opciones. \nA) Introducir eventos sociales semanales \nB) Proporcionar recursos apropiados \nC) Iniciar revisiones de desempeño \nD) Revisar las políticas de la empresa \nE) Destacar las fortalezas personales", // 
    }; 

    private String[] ListaLidRespuestas = {
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

    //Constructor________________________________________________________
    public TestLider(){

    }
    //Metodos getters____________________________________________________
    public String[] getListaLid(){
        return ListaLid;
    }
    
    public String[] getListaLidRespuestas(){
        return ListaLidRespuestas;
    }
}