package sfg.udemy.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by Ari on 10.10.2020
 */
@Service
public class JokesServiceImpl implements JokesService {
	private final ChuckNorrisQuotes jokeGenerator;

	public JokesServiceImpl() {
		this.jokeGenerator = new ChuckNorrisQuotes();
	}

	public JokesServiceImpl(ChuckNorrisQuotes jokeGenerator) {
		this.jokeGenerator = jokeGenerator;
	}

	@Override
	public String getRandomJoke() {
		return jokeGenerator.getRandomQuote();
	}
}
