# ice4j
Automatically exported from code.google.com/p/ice4j

<a href="http://www.stellarbuild.com/blog/article/ice4j-networking-tutorial-part-1">You can read an ICE4J tutorial here</a>

I have tried to make a few updates and changes to make ICE4J more easily used without the use of LibJitsi/Jitsi. I haven't broken anything, I so far have removed data size limitations, which don't affect efficiency. It just causes bugs for library users who conform to Java standards but not LibJitsi requirements.


I hope to add some new classes and files to allow a more useable ICE4J experience, a neat, but incomplete library on its own. Specifically it is lacking classes and code for formatting RTP packets even though it requires RTP (or non-stun/turn) packets on the receiving end.


I am not an expert just a user who would like to contribute. The original google code source should still update to here.
