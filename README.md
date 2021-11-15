# Spring_Boot_Work

Assignment done

@RequestMapping("/sum/{num1}/{num2}")
	public int getSum(@PathVariable(name = "num1") Integer a, @PathVariable(name = "num2") Integer b) {

		return a + b;
	}

	@RequestMapping("/addition")
	public int getaddition(@RequestParam int num1,@RequestParam int num2) {
		return num1+num2;
	}
