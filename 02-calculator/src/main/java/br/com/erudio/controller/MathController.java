package br.com.erudio.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exception.UnsuportedMathOperationExsception;
import br.com.erudio.foo.request.converters.NumberConverter;
import br.com.erudio.math.SimpleMath;

@RestController
public class MathController {
	
	SimpleMath math = new SimpleMath();
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne,
			          @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationExsception("Plase set a numeric value!");
		}
		return math.sum(NumberConverter.convertToDouble(numberOne), 
				        NumberConverter.convertToDouble(numberTwo));
	}

	@RequestMapping(value="/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sub(@PathVariable("numberOne") String numberOne,
			          @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationExsception("Plase set a numeric value!");
		}
		return math.sub(NumberConverter.convertToDouble(numberOne),
				        NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/mul/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mul(@PathVariable("numberOne") String numberOne,
			          @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationExsception("Plase set a numeric value!");
		}
		return math.mul(NumberConverter.convertToDouble(numberOne),
				        NumberConverter.convertToDouble(numberTwo));
	}

	@RequestMapping(value="/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(@PathVariable("numberOne") String numberOne,
			          @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationExsception("Plase set a numeric value!");
		}
		return math.div(NumberConverter.convertToDouble(numberOne),
				        NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double media(@PathVariable("numberOne") String numberOne,
			            @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationExsception("Plase set a numeric value!");
		}
		return math.media(NumberConverter.convertToDouble(numberOne),
				          NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/raiz/{number}", method = RequestMethod.GET)
	public Double raiz(@PathVariable("number") String numberOne) throws Exception {
		if (!NumberConverter.isNumeric(numberOne)) {
			throw new UnsuportedMathOperationExsception("Plase set a numeric value!");
		}
		return math.raiz(NumberConverter.convertToDouble(numberOne));
	}
	
}
