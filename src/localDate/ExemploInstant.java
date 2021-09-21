package localDate;

import java.time.Duration;
import java.time.Instant;

public class ExemploInstant {
	public static void main(String[] args) {
		Instant tempoInicial = Instant.now();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Instant tempoFinal = Instant.now();
		
		Duration duracao = Duration.between(tempoInicial, tempoFinal);
		
		System.out.println("Dura��o em nanos segundos: " + duracao.toNanos());
		System.out.println("Dura��o em minutos: " + duracao.toMinutes());
		System.out.println("Dura��o em horas: " + duracao.toHours());
		System.out.println("Dura��o em milisegundos: " + duracao.toMillis());
		System.out.println("Dura��o em dias: " + duracao.toDays());
	}
}
