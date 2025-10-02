public class CodeChadsAcademy {

    public static void main(String[] args) {
    	
        // Notas
        int[] notas = new int[5]; 
        notas[0] = 80; // nota1
        notas[1] = 59; // nota2
        notas[2] = 80; // nota3

        // Calcular Nota 4
        if (notas[1] < 60) {
            notas[3] = 100;
        } else {
            notas[3] = notas[1];
        }

        // Calcular Nota 5
        if (notas[0] + notas[2] > 150) {
            notas[4] = 95;
        } else {
            notas[4] = 70;
        }

        int ancho = 55; // Ancho Uniforme para los prints
        String bordeSup = "┌" + "─".repeat(ancho) + "┐";
        String bordeMed = "├" + "─".repeat(ancho) + "┤";
        String bordeInf = "└" + "─".repeat(ancho) + "┘";

        // ──────────────────────────────
        // Mostrar Notas con caja ASCII
        // ──────────────────────────────
        System.out.println(bordeSup);
        System.out.printf("│%-" + ancho + "s│%n", " RESULTADOS DEL ESTUDIANTE");
        System.out.println(bordeMed);
        for (int i = 0; i < notas.length; i++) {
            String linea = "Nota " + (i + 1) + ": " + notas[i] + " puntos";
            System.out.printf("│%-" + ancho + "s│%n", linea);
        }
        System.out.println(bordeInf);

        // Verificar si aprobó todas
        int aprobadas = 0;
        for (int n : notas) {
            if (n >= 60) aprobadas++;
        }
        System.out.println(bordeSup);
        String resultado;
        if (aprobadas == notas.length) {
            resultado = "Aprobaste todas. ¡Backend Sensei!";
        } else if (aprobadas == 0) {
            resultado = "No aprobaste ninguna. Sos un clon de frontend";
        } else {
            resultado = "Algunas aprobadas. Sos un refactor en progreso.";
        }
        System.out.printf("│%-" + ancho + "s│%n", "Resultado:");
        System.out.printf("│%-" + ancho + "s│%n", resultado);
        System.out.println(bordeInf);

        // Prueba más inconsistente
        int mayorSalto = 0;
        int indice = 0;
        for (int i = 0; i < notas.length - 1; i++) {
            int salto;
            if (notas[i] >= notas[i + 1]) {
                salto = notas[i] - notas[i + 1];
            } else {
                salto = notas[i + 1] - notas[i];
            }
            if (salto > mayorSalto) {
                mayorSalto = salto;
                indice = i;
            }
        }
        System.out.println(bordeSup);
        System.out.printf("│%-" + ancho + "s│%n", "Análisis de rendimiento:");
        String lineaSalto = "Mayor salto: " + mayorSalto + " puntos entre prueba "
                           + (indice + 1) + " y prueba " + (indice + 2);
        System.out.printf("│%-" + ancho + "s│%n", lineaSalto);
        System.out.println(bordeInf);
        
        // Bonus por progreso (solo primeras 3 notas)
        boolean progresivo = true;
        for (int i = 0; i < 2; i++) {
            if (notas[i + 1] <= notas[i]) {
                progresivo = false;
                break;
            }
        }
        if (progresivo) {
            System.out.println(bordeSup);
            System.out.printf("│%-" + ancho + "s│%n", "Bonus por progreso:");
            System.out.printf("│%-" + ancho + "s│%n", "Nivel PROGRESIVO: Stone Chad en crecimiento");
            System.out.println(bordeInf);
        }

        // Mostrar notas ordenadas (sin sort)
        int[] ordenadas = notas.clone(); 
        for (int i = 0; i < ordenadas.length - 1; i++) {
            for (int j = i + 1; j < ordenadas.length; j++) {
                if (ordenadas[j] > ordenadas[i]) {
                    int temp = ordenadas[i];
                    ordenadas[i] = ordenadas[j];
                    ordenadas[j] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder("Notas ordenadas (mayor a menor): ");
        for (int n : ordenadas) {
            sb.append(n).append(" ");
        }
        System.out.println(bordeSup);
        System.out.printf("│%-" + ancho + "s│%n", sb.toString().trim());
        System.out.println(bordeInf);

        // Evaluación final por nivel
        int total = 0;
        for (int n : notas) total += n;

        String nivel;
        if (total < 250) {
            nivel = "Nivel final: Normie total";
        } else if (total <= 349) {
            nivel = "Nivel final: Soft Chad";
        } else if (total <= 449) {
            nivel = "Nivel final: Chad";
        } else {
            nivel = "Nivel final: Stone Chad definitivo";
        }
        System.out.println(bordeSup);
        System.out.printf("│%-" + ancho + "s│%n", "Evaluación final:");
        System.out.printf("│%-" + ancho + "s│%n", nivel);
        System.out.println(bordeInf);
    }
}
