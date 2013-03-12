Karotz Plugin (Jenkins)
=======================

This [Jenkins](http://jenkins-ci.org/) plugin aims to publish build results to your [Karotz](http://www.karotz.com/).

It should work [like this](http://www.youtube.com/watch?v=Uq0XebJq1S4) when
it's installed :)

Installation
------------

See also the [main plugin page](http://wiki.jenkins-ci.org/display/JENKINS/Karotz+Plugin)
and the [requirements page](https://wiki.jenkins-ci.org/display/JENKINS/Karotz+Plugin+Requirement).

You don't need to go through the steps to create an application package if you
don't want to as there is already a [Jenkins notifier](http://www.karotz.com/appz/app?id=1736)
app in Karotz app store. However if you prefer to create your own application
the following notes will be helpful.

Here is a full example [`descriptor.xml`](http://wiki.karotz.com/index.php/Descriptor.xml):

    <descriptor>
      <version>1.0</version>
      <accesses>
        <access>tts</access>
        <access>ears</access>
        <access>led</access>
        <access>multimedia</access>
      </accesses>
      <deployment>external</deployment>
      <parameters>
        <parameter key="showInstallUuid" value="true"/>
      </parameters>
    </descriptor>

__Note that the Upload Code facility doesn't accept gzip format archivs, only__
__standard zip format archives.__ The simplest way to create such an archive is
to right-click `descriptor.xml` in Windows Exloperer and "Sent to ..." a
"Compressed (zipped) folder". The `descriptor.xml` should be placed in the root
of the zip.

Credits
-------

* William Durand
* Dan Hagon