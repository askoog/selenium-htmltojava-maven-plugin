package dridco.seleniumhtmltojava.commands

abstract class AbstractAssertConfirmationTest extends AbstractCommandTest {

	def abstract input()

	def abstract parsed()

	@Override
	def protected htmlInstructions() {
		"""
<tr>
        <td>assertConfirmation</td>
        <td>${input()}</td>
        <td></td>
</tr>
"""
	}

	@Override
	def protected expectedResult() {
		"""assertEquals(\"assertConfirmation(\\\"${parsed()}\\\", \\\"\\\")\", unescapeJava("${parsed()}"), selenium.getConfirmation());"""
	}
}
