package org.hisrc.jsonix.definition;

import java.text.MessageFormat;
import java.util.List;

import org.apache.commons.lang3.Validate;

public class Module<T, C extends T> {

	private final String name;
	private final List<Mapping<T, C>> mappings;
	private final List<Output> outputs;

	public Module(String name,
			List<Mapping<T, C>> mappings, List<Output> outputs) {
		Validate.notNull(name);
		Validate.noNullElements(mappings);
		Validate.noNullElements(outputs);
		this.name = name;
		this.mappings = mappings;
		this.outputs = outputs;
	}

	public String getName() {
		return name;
	}

	public List<Mapping<T, C>> getMappings() {
		return mappings;
	}

	public List<Output> getOutputs() {
		return outputs;
	}

	@Override
	public String toString() {
		return MessageFormat.format("Module [{0}].", this.name);
	}
}