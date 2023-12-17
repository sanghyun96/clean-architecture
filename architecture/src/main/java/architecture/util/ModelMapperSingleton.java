package architecture.util;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public class ModelMapperSingleton {

	private static ModelMapper modelMapper;

	public static ModelMapper getModelMapperInstance() {
		if (modelMapper == null) {
			modelMapper = new ModelMapper();
			modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		}
		return modelMapper;
	}
}
