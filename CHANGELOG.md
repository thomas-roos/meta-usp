# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]


## Release honister_v3.5.5 - 2024-03-18(12:12:12 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] PeriodicNotifInterval changes are only applied after reboot

## Release honister_v3.5.4 - 2024-03-14(11:23:42 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [CDROUTER][USP] Delete Message - Allow Partial True fails

## Release honister_v3.5.3 - 2024-02-28(12:48:56 +0000)

### Other

- [libusp](https://gitlab.com/prpl-foundation/components/core/libraries/libusp): Rename BBF license to OBUSPA license

## Release honister_v3.5.2 - 2024-02-28(09:07:49 +0000)

### Other

- [libusp](https://gitlab.com/prpl-foundation/components/core/libraries/libusp): [USP] Fix licensing issues for opensourcing USP libs
- [libusp](https://gitlab.com/prpl-foundation/components/core/libraries/libusp): Move component to prpl-foundation gitlab

## Release honister_v3.5.1 - 2024-02-16(14:16:24 +0000)

### Other

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Extend unit tests

## Release honister_v3.5.0 - 2024-02-15(12:56:00 +0000)

### New

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Support of OnChange! Event

## Release honister_v3.4.1 - 2024-02-15(11:43:45 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): MTP status remains down

## Release honister_v3.4.0 - 2024-01-30(16:02:27 +0000)

### New

- [libimtp](https://gitlab.com/prpl-foundation/components/core/libraries/libimtp): [libimtp] Add file descriptor transfer functionality

## Release honister_v3.3.5 - 2024-01-26(11:08:44 +0000)

### Fixes

- [mod-amxb-usp](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_usp): [USP] Issue with asynchronous calls

## Release honister_v3.3.4 - 2024-01-18(11:56:53 +0000)

### Fixes

- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] usp-endpoint needs to load usp backend

## Release honister_v3.3.3 - 2024-01-12(11:26:19 +0000)

### Fixes

- [mod-amxb-usp](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_usp): [USP] amxb_usp_poll_response returns with error randomly

## Release honister_v3.3.2 - 2024-01-11(14:48:17 +0000)

### Other

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Add quick start guide to uspagent

## Release honister_v3.3.1 - 2024-01-09(10:29:07 +0000)

### Other

- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): Remove circular dependency

## Release honister_v3.3.0 - 2024-01-08(16:26:06 +0000)

### New

- [mod-amxb-usp](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_usp): Allow creating subscriptions via LocalAgent.Subscription dm

## Release honister_v3.2.0 - 2024-01-04(09:14:50 +0000)

### New

- [mod-amxb-usp](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_usp): [USP] Set up communication with obuspa

### Fixes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Auto cast results from a get response
- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Auto cast results from a set and add response
- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Add extra NULL pointer checks
- [mod-amxb-usp](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_usp): Fix license headers in files
- [mod-amxb-usp](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_usp): Deferred calls are cleaned up before everything is done
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Describe returns list with result
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): LocalAgent.MTP.{i}.Status not updated properly
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Register rollback does too much

### Changes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Make set response less strict
- [mod-amxb-usp](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_usp): [USP] All plugins on host connect to the USP agent socket
- [mod-amxb-usp](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_usp): [USP] It must be possible to configure capabilities
- [mod-amxb-usp](https://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_usp): [USP] Backend must be able to handle interleaved messages
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Add with sub-object parameters must be supported
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Move USP backend location

### Other

- [libimtp](https://gitlab.com/prpl-foundation/components/core/libraries/libimtp): Update documentation
- [libimtp](https://gitlab.com/prpl-foundation/components/core/libraries/libimtp): Move library to prpl gitlab
- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): Don't rename LICENSE.BSD to LICENSE in oss
- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] Enable documentation generation for libuspi
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [LCM] Error code is not forwarded correctly from LCM to USP in case of InstallDU using a non-existent EE

## Release honister_v3.1.2 - 2023-10-16(21:39:53 +0000)

### Fixes

- [mod-amxb-usp](https://gitlab.com/soft.at.home/usp/modules/amxb_backends/amxb_usp): Block SIGALARM during USP socket polling to avoid interrupting it

## Release honister_v3.1.1 - 2023-10-16(09:48:49 +0000)

## Release honister_v3.1.0 - 2023-10-10(14:44:37 +0000)

### New

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Use latest protobuf schema
- [libuspprotobuf](https://gitlab.com/soft.at.home/usp/libraries/libprotobuf): [USP] Use latest protobuf schema
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Update USP error codes for registration

### Fixes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] deregistered_path can be repeated
- [libuspprotobuf](https://gitlab.com/soft.at.home/usp/libraries/libprotobuf): [USP] deregistered_path can be repeated
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Fix license headers in files
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] onboard request not automatically sent by IB4 when MTP is re-enabled

### Other

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): Fix license headers in files

## Release honister_v3.0.5 - 2023-09-21(22:35:14 +0000)

## Release honister_v3.0.4 - 2023-09-18(10:28:58 +0000)

## Release honister_v3.0.3 - 2023-09-18(10:26:19 +0000)

### Other

- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [usp-endpoint] Fix baf output and remove () from condition check

## Release honister_v3.0.2 - 2023-09-15(11:32:02 +0000)

## Release honister_v3.0.1 - 2023-09-15(11:16:32 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Only send BulkData reports to subscribed controller
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Only send BulkData reports to subscribed controller

### Other

- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [usp-endpoint] Install uspa_definition.odl when CONFIG_SAH_SERVICES_USPE is enabled

## Release honister_v3.0.0 - 2023-09-14(14:22:50 +0000)

### Breaking

- [libimtp](https://gitlab.com/soft.at.home/usp/libraries/libimtp): [IMTP] Implement IMTP communication as specified in TR-369
- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [IMTP] Implement IMTP communication as specified in TR-369
- [mod-amxb-usp](https://gitlab.com/soft.at.home/usp/modules/amxb_backends/amxb_usp): [IMTP] Implement IMTP communication as specified in TR-369
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [IMTP] Implement IMTP communication as specified in TR-369
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [IMTP] Implement IMTP communication as specified in TR-369

### New

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [PRPL][USP][Onboarding]MTP Connector usp messages missing
- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] GSDM should return whether commands are (a)sync
- [libuspprotobuf](https://gitlab.com/soft.at.home/usp/libraries/libprotobuf): [USP] Add UDS connect record to library
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Add config flag to ignore partial
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Our uspagent should use the USPServices data model
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Retry onboarding in case it is not confirmed
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] GSDM should return whether commands are (a)sync

### Fixes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Update log message for allow_partial=false
- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] messages are not published sometimes
- [mod-amxb-usp](https://gitlab.com/soft.at.home/usp/modules/amxb_backends/amxb_usp): USP UDS connection is complete when handshake is done
- [mod-amxb-usp](https://gitlab.com/soft.at.home/usp/modules/amxb_backends/amxb_usp): [USP] Remove handshake from connect
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Notify response published on wrong topic
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Remove handshake from connect
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Retry IMTP connection in case of failure
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Prevent segmentation fault after IMTP disconnect
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] messages are not published sometimes

### Changes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Trigger Device.Boot! event from uspagent

### Other

- [mod-amxb-usp](https://gitlab.com/soft.at.home/usp/modules/amxb_backends/amxb_usp): Remove redundant line of code
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): Recommend using allow_partial = true
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Add config variables for init script of usp-endpoint
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [KPN][USP] Boot! event is not as expected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [AMX] Replace ubus-cli in debuginfo script
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Bus timeout when fetching Device object on boot

## Release honister_v2.2.0 - 2023-07-03(15:49:05 +0000)

### New

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): It must be possible to build partially failed add responses
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Support Error Code: 7025 'Object exists with duplicate key'
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [Security][USP] Add ACLs for get instances to USP agent
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [Security][USP] Add ACLs for get supported dm to USP agent

### Fixes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] allow_partial=false must be rejected
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP][MQTT] Missing unique keys for MQTT data model

### Changes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Add specific error codes for get instances
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] allow_partial=false must be rejected

### Other

- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): Extend README with runtime dependencies
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [CR9HF] - Multiple uspagent sessions running

## Release honister_v2.1.0 - 2023-05-23(09:28:18 +0000)

### New

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [Security][USP] Add ACLs for subscriptions to USP agent

## Release honister_v2.0.1 - 2023-05-22(15:09:16 +0000)

### Fixes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Input arguments must be JSON encoded

## Release honister_v2.0.0 - 2023-05-22(09:41:03 +0000)

### Breaking

- [mod-amxb-usp](https://gitlab.com/soft.at.home/usp/modules/amxb_backends/amxb_usp): Subscriptions with the USP backend no longer work

### New

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): gsdm missing arguments for commands and events
- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Add NotifType AmxNotification for ambiorix events
- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] Add support for subscriptions to usp-endpoint
- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] Add NotifType AmxNotification for ambiorix events
- [libuspprotobuf](https://gitlab.com/soft.at.home/usp/libraries/libprotobuf): [USP] Add NotifType AmxNotification for ambiorix events
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Add support for subscriptions to usp-endpoint
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] usp-endpoint must be able to broker amx subscriptions
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP][CDROUTER] The NotifExpiration limit is not respected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] uspagent must be able to broker amx subscriptions
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Send ForceReconnect based on AutoReconnect parameter
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] It must be possible to use protected methods

### Fixes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Remove var dumps from libusp
- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP][AMX] GSDM needs a ValueChangeType
- [mod-amxb-usp](https://gitlab.com/soft.at.home/usp/modules/amxb_backends/amxb_usp): [USP] Get with depth not working as expected
- [mod-amxb-usp](https://gitlab.com/soft.at.home/usp/modules/amxb_backends/amxb_usp): [USP] Agent stuck doing blocking amxb_resolves
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Controllers with are added with an invalid EndpointID
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): HGWKPN-2285 [USP][Set Message] Error code not as expected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Correctly save last value of parameter subscriptions
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Must be able to forward notifications on IMTP
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Missing index number in ObjectCreation notifications
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Parameter paths must be fetched with depth=0
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Dynamically adding LocalAgent.MTP. instances does not work
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [KPN][USP] Boot! event notification is not as expected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Discovery object should not be protected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Disabling second controller breaks IMTP connection for first
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Improve ACL handling with adds
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP][Regression] Cannot find IMTP con for enabled controller
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Agent stuck doing blocking amxb_resolves

### Changes

- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] Port subscription changes to libuspi
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Port subscription changes to usp-endpoint
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Add requests with search paths will be allowed

### Other

- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [uspe] Remove default endpoint id for uspe
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Add tr181-mqtt/tr181-localagent/uspagent into processmonitor
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Update unit tests after recent changes
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Documentation should be written for adding subscriptions to containers
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Extend subscription unit tests

## Release honister_v1.5.0 - 2023-04-26(08:44:54 +0000)

### New

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Add NotifType AmxNotification for ambiorix events
- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] Add support for subscriptions to usp-endpoint
- [libuspprotobuf](https://gitlab.com/soft.at.home/usp/libraries/libprotobuf): [USP] Add NotifType AmxNotification for ambiorix events
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Add support for subscriptions to usp-endpoint
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP][CDROUTER] The NotifExpiration limit is not respected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Send ForceReconnect based on AutoReconnect parameter

### Fixes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Remove var dumps from libusp
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Correctly save last value of parameter subscriptions
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Must be able to forward notifications on IMTP
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Parameter paths must be fetched with depth=0
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Dynamically adding LocalAgent.MTP. instances does not work
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [KPN][USP] Boot! event notification is not as expected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Discovery object should not be protected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Disabling second controller breaks IMTP connection for first
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Improve ACL handling with adds
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP][Regression] Cannot find IMTP con for enabled controller

### Changes

- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] Port subscription changes to libuspi
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Port subscription changes to usp-endpoint
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Add requests with search paths will be allowed

### Other

- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [uspe] Remove default endpoint id for uspe
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Add tr181-mqtt/tr181-localagent/uspagent into processmonitor
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Update unit tests after recent changes
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Documentation should be written for adding subscriptions to containers
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Extend subscription unit tests

## Release honister_v1.5.0 - 2023-04-26(07:38:17 +0000)

### New

- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] Add support for subscriptions to usp-endpoint
- [libuspprotobuf](https://gitlab.com/soft.at.home/usp/libraries/libprotobuf): [USP] Add NotifType AmxNotification for ambiorix events
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Add support for subscriptions to usp-endpoint
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP][CDROUTER] The NotifExpiration limit is not respected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Send ForceReconnect based on AutoReconnect parameter

### Fixes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Remove var dumps from libusp
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Correctly save last value of parameter subscriptions
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Must be able to forward notifications on IMTP
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Parameter paths must be fetched with depth=0
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Dynamically adding LocalAgent.MTP. instances does not work
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [KPN][USP] Boot! event notification is not as expected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Discovery object should not be protected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Disabling second controller breaks IMTP connection for first
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Improve ACL handling with adds
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP][Regression] Cannot find IMTP con for enabled controller

### Changes

- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] Port subscription changes to libuspi
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Port subscription changes to usp-endpoint
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Add requests with search paths will be allowed

### Other

- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [uspe] Remove default endpoint id for uspe
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Add tr181-mqtt/tr181-localagent/uspagent into processmonitor
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Update unit tests after recent changes
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Documentation should be written for adding subscriptions to containers
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Extend subscription unit tests

## Release honister_v1.5.0 - 2023-04-25(14:09:52 +0000)

### New

- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] Add support for subscriptions to usp-endpoint
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Add support for subscriptions to usp-endpoint
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP][CDROUTER] The NotifExpiration limit is not respected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Send ForceReconnect based on AutoReconnect parameter

### Fixes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Remove var dumps from libusp
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Correctly save last value of parameter subscriptions
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Must be able to forward notifications on IMTP
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Parameter paths must be fetched with depth=0
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Dynamically adding LocalAgent.MTP. instances does not work
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [KPN][USP] Boot! event notification is not as expected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Discovery object should not be protected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Disabling second controller breaks IMTP connection for first
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Improve ACL handling with adds
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP][Regression] Cannot find IMTP con for enabled controller

### Changes

- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] Port subscription changes to libuspi
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Port subscription changes to usp-endpoint
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Add requests with search paths will be allowed

### Other

- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [uspe] Remove default endpoint id for uspe
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Add tr181-mqtt/tr181-localagent/uspagent into processmonitor
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Update unit tests after recent changes
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Documentation should be written for adding subscriptions to containers
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Extend subscription unit tests

## Release honister_v1.6.0 - 2023-04-13(09:51:41 +0000)

## Release honister_v1.5.0 - 2023-04-12(15:05:12 +0000)

### New

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP][CDROUTER] The NotifExpiration limit is not respected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Send ForceReconnect based on AutoReconnect parameter

### Fixes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Remove var dumps from libusp
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Correctly save last value of parameter subscriptions
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Must be able to forward notifications on IMTP
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Dynamically adding LocalAgent.MTP. instances does not work
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [KPN][USP] Boot! event notification is not as expected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Discovery object should not be protected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Disabling second controller breaks IMTP connection for first

### Changes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Add requests with search paths will be allowed

### Other

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Documentation should be written for adding subscriptions to containers

## Release honister_v1.4.3 - 2023-02-24(15:52:29 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Parameter paths must be fetched with depth=0

### Other

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Add tr181-mqtt/tr181-localagent/uspagent into processmonitor
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Update unit tests after recent changes

## Release honister_v1.4.2 - 2023-02-09(12:41:03 +0000)

### Removed

- [mod-discovery](https://${GIT_BASE_URL}/amx/usp/modules/mod-discovery): Component removed
- [mod-usp-cli](https://${GIT_BASE_URL}/amx/usp/modules/amx_cli/mod-usp-cli): Component removed
- [mod-usp-onboarding](https://${GIT_BASE_URL}/amx/usp/modules/mod_usp_onboarding): Component removed

## Release honister_v1.4.0 - 2023-02-09(10:51:26 +0000)

## Release honister_v1.2.11 - 2023-02-01(14:38:09 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Remove doc target from uspagent

### Changes

- [mod-usp-onboarding](https://${GIT_BASE_URL}/amx/usp/modules/mod_usp_onboarding): [USP] Make mod_usp_onboarding configurable

## Release honister_v1.2.9 - 2023-01-31(13:04:33 +0000)

### Fixes

- [mod-usp-onboarding](https://${GIT_BASE_URL}/amx/usp/modules/mod_usp_onboarding): HGWKPN-1783 [ACS] [SW2]: Device.Reboot() runs but does not finish in MOTIVE

## Release honister_v1.2.8 - 2023-01-23(14:05:59 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP Agent][Amx]USP request returns 'invalid path' all the time

## Release honister_v1.2.7 - 2023-01-13(08:07:17 +0000)

## Release honister_v1.2.6 - 2023-01-13(03:38:17 +0000)

## Release honister_v1.2.5 - 2023-01-13(03:21:18 +0000)

## Release honister_v1.2.4 - 2023-01-13(03:11:38 +0000)

## Release honister_v1.2.3 - 2023-01-13(03:04:17 +0000)

## Release honister_v1.2.2 - 2023-01-13(02:38:36 +0000)

## Release honister_v1.2.1 - 2023-01-12(17:22:52 +0000)

## Release honister_v1.2.0 - 2023-01-12(11:00:07 +0000)

### Other

- [libimtp](https://gitlab.com/soft.at.home/usp/libraries/libimtp): [SAHPairing] Make sahpairing work with MQTT client

## Release honister_v1.1.2 - 2023-01-11(16:34:41 +0000)

### Changes

- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [KPN][USP] max_depth has no effect on the Get Message

## Release honister_v1.1.1 - 2023-01-11(16:29:33 +0000)

### Changes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [KPN][USP] max_depth has no effect on the Get Message

## Release honister_v1.1.0 - 2023-01-11(16:04:48 +0000)

### New

- [mod-amxb-usp](https://gitlab.com/soft.at.home/usp/modules/amxb_backends/amxb_usp): [USP][AMX] Add support for asynchronous invokes to USP backend

### Fixes

- [mod-amxb-usp](https://gitlab.com/soft.at.home/usp/modules/amxb_backends/amxb_usp): [USP][AMX] Return variant of get_supported must be updated
- [mod-amxb-usp](https://gitlab.com/soft.at.home/usp/modules/amxb_backends/amxb_usp): Handle command output args for non-backend processes

### Changes

- [mod-amxb-usp](https://gitlab.com/soft.at.home/usp/modules/amxb_backends/amxb_usp): [KPN][USP] max_depth has no effect on the Get Message

## Release honister_v1.0.1 - 2023-01-11(14:28:14 +0000)

## Release honister_v1.0.0 - 2023-01-11(12:40:51 +0000)

### Breaking

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [KPN][USP] max_depth has no effect on the Get Message

## Release honister_v0.0.11 - 2023-01-10(01:11:02 +0000)

## Release honister_v0.0.10 - 2023-01-09(15:45:49 +0000)

### Fixes

- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): Handle command output args for non-backend processes

## Release honister_v0.0.9 - 2023-01-09(11:43:17 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Get requests with valid search expressions must return successful

## Release honister_v0.0.8 - 2023-01-09(10:28:17 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [Bulkdata][USP] Controller parameter must be set

## Release honister_v0.0.7 - 2023-01-09(09:24:18 +0000)

### Fixes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Get requests with valid search expressions must return successful
- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] GSDM response cannot be extracted properly

## Release honister_v0.0.6 - 2023-01-09(09:19:57 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): LocalAgent.MTP.i.Status must be Up if MQTT client is connected

## Release honister_v0.0.5 - 2023-01-06(13:23:35 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [uspagent] dm:OperationComplete created too late

## Release honister_v0.0.4 - 2022-12-20(13:59:19 +0000)

## Release honister_v0.0.3 - 2022-12-07(09:05:39 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [AMX] Apply new amxd_path_setf formatting
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Allow invoking commands without braces

