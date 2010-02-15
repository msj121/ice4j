package org.ice4j.ice;

import org.ice4j.*;

/**
 * <tt>ServerReflexiveCandidate</tt>s are candidates whose IP address and port
 *  are a binding allocated by a NAT for an agent when it sent a packet through
 *  the NAT to a server. <tt>ServerReflexiveCandidate</tt>s can be learned by
 *  STUN servers using the Binding Request, or TURN servers, which provides
 *  both a Relayed and Server Reflexive candidate.
 * <p>
 * This class does not contain a socket itself and in order to send bytes
 * over the network, one has to retrieve the socket of its basis.
 * </p>
 *
 * @author Emil Ivov
 */
public class ServerReflexiveCandidate extends Candidate
{

    /**
     * Creates a <tt>ServerReflexiveCandidate</tt> for the specified transport
     * address, and base.
     *
     * @param address the {@link TransportAddress} that this <tt>Candidate</tt>
     * is representing.
     * @param base the {@link HostCandidate} that this server reflexive
     * candidate was obtained through.
     * @param stunSrvrAddr the {@link TransportAddress} of the stun server that
     * reflected this candidate.
     */
    public ServerReflexiveCandidate(TransportAddress address,
                                    HostCandidate    base,
                                    TransportAddress stunSrvrAddr)
    {
        super(address,
              base.getParentComponent(),
              CandidateType.SERVER_REFLEXIVE_CANDIDATE);

        setBase(base);
        setStunServerAddress(stunSrvrAddr);
    }
}
