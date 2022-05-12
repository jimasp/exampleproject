# pylint: disable=missing-module-docstring
# pylint: disable=missing-function-docstring
# pylint: disable=missing-class-docstring
import unittest

class Tests(unittest.TestCase):
    def test_pass_py(self):
        self.assertEqual("foo".upper(), "FOO")

    @unittest.skip("testing skipping")
    def test_skip1_py(self):
        pass


