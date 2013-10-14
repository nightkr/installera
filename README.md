Installera
==========

Installer generator generator.

Features (NYI)
--------------

*   Configuration through internal Scala DSL
*   File "bundles"
    *   Contains 1 or more files each
    *   Can be conditionally included
*   Hopefully better documented than IzPack
*   Generate customized system-native packages (.deb files for Debian-based linux distros, pacman packages for Arch, .msi installers for Windows, etc)
    *   Done behind the scenes; regular GUI users should not notice this
*   Fairly UI-agnostic (should work equally well as at least an interactive (ncurses-style) CLI and a GUI)
*   Composable forms
