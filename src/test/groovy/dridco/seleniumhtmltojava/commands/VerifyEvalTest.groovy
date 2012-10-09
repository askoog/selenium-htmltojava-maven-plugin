package dridco.seleniumhtmltojava.commands

class VerifyEvalTest extends AbstractCommandTest {

	@Override
	def protected htmlInstructions() {
		"""
<tr>
        <td>verifyEval</td>
        <td>'\${something}'.replace('foo','').trim()</td>
        <td>\${other thing}</td>
</tr>
"""
	}

	@Override
	def protected expectedResult() {
		"assertTrue(\"verifyEval(\\\"\'\" + storage.get(\"something\") + \"\'.replace(\'foo\','').trim()\\\", \\\"\" + storage.get(\"other thing\") + \"\\\")\", selenium.getEval(\"\'\" + storage.get(\"something\") + \"\'.replace(\'foo\','').trim()\").matches((\"\" + storage.get(\"other thing\") + \"\").replaceAll(\"\\\\*\", \".*\").replaceAll(\"\\\\|\", \"\\\\\\\\|\")));"
	}
}
